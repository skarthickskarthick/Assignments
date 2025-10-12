package com.example.web;

import com.example.util.JwtUtil;
import com.example.util.RedisUtil;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Optional
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String path = req.getRequestURI();

        // Allow public pages and static files
        if (path.endsWith("login.jsp") ||
                path.endsWith("register.jsp") ||
                path.endsWith("LoginServlet") ||
                path.endsWith("RegisterServlet") ||
                path.endsWith(".css") ||
                path.endsWith(".js") ||
                path.endsWith(".png") ||
                path.endsWith(".jpg")) {
            chain.doFilter(request, response);
            return;
        }

        boolean sessionValid = false;
        HttpSession session = req.getSession(false);

        // 1️⃣ Check if session exists and is valid in Redis
        if (session != null && session.getAttribute("userId") != null) {
            String userId = session.getAttribute("userId").toString();
            String redisSessionId = RedisUtil.getSession(Integer.parseInt(userId));

            if (redisSessionId != null && redisSessionId.equals(session.getId())) {
                // Session is valid in Redis
                sessionValid = true;
            } else {
                // Session invalid in Redis
                session.invalidate();
            }
        }

        // 2️⃣ Check JWT tokens if session is not valid
        String accessToken = getCookieValue(req, "access_token");
        String refreshToken = getCookieValue(req, "refresh_token");
        boolean tokenValid = false;

        if (accessToken != null) {
            try {
                // Verify access token
                DecodedJWT jwt = JwtUtil.verifyToken(accessToken);
                String userId = jwt.getSubject();

                // Verify token exists in Redis
                String redisUser = RedisUtil.getUserIdByAccessToken(accessToken);
                if (redisUser != null && redisUser.equals(userId)) {
                    tokenValid = true;

                    // If session is null, create session from token
                    if (session == null) {
                        session = req.getSession(true);
                        session.setAttribute("userId", Integer.parseInt(userId));
                    }
                }

            } catch (TokenExpiredException ex) {
                // Access token expired, try refresh token
                if (refreshToken != null && RedisUtil.getUserIdByRefreshToken(refreshToken) != null) {
                    String userId = RedisUtil.getUserIdByRefreshToken(refreshToken);

                    // Generate new access token
                    com.example.model.User dummyUser = new com.example.model.User();
                    dummyUser.setId(Integer.parseInt(userId));
                    String newAccess = JwtUtil.generateAccessToken(dummyUser);

                    // Save new token in Redis
                    RedisUtil.saveAccessToken(newAccess, dummyUser.getId(), 5 * 60);

                    // Update cookie
                    Cookie at = new Cookie("access_token", newAccess);
                    at.setHttpOnly(true);
                    at.setPath("/");
                    resp.addCookie(at);

                    tokenValid = true;

                    // Create session if missing
                    if (session == null) {
                        session = req.getSession(true);
                        session.setAttribute("userId", dummyUser.getId());
                    }
                }

            } catch (JWTVerificationException e) {
                // Invalid token
                tokenValid = false;
            }
        }

        // 3️⃣ Allow if either session or token is valid
        if (sessionValid || tokenValid) {
            chain.doFilter(request, response);
            return;
        }

        // 4️⃣ If neither session nor token is valid → redirect to login
        resp.sendRedirect("login.jsp");
    }

    // Helper method to extract cookie value
    private String getCookieValue(HttpServletRequest req, String name) {
        if (req.getCookies() == null) return null;
        for (Cookie c : req.getCookies()) {
            if (name.equals(c.getName())) return c.getValue();
        }
        return null;
    }

    @Override
    public void destroy() {
        // Optional cleanup
    }
}
