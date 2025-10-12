package com.example.web;

import com.example.util.RedisUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if(session != null) {
            Integer userId = (Integer) session.getAttribute("userId");

            if(userId != null) {
                // Delete session from Redis
                RedisUtil.deleteSession(userId);

                // Delete access and refresh tokens from Redis
                String accessToken = null;
                String refreshToken = null;

                // Retrieve tokens from cookies
                if(req.getCookies() != null) {
                    for(Cookie c : req.getCookies()) {
                        if("access_token".equals(c.getName())) accessToken = c.getValue();
                        if("refresh_token".equals(c.getName())) refreshToken = c.getValue();
                    }
                }

                if(accessToken != null) RedisUtil.deleteAccessToken(accessToken);
                if(refreshToken != null) RedisUtil.deleteRefreshToken(refreshToken);
            }

            // Invalidate session
            session.invalidate();
        }

        // Delete cookies on client-side
        Cookie at = new Cookie("access_token", "");
        at.setMaxAge(0);
        at.setPath("/");
        resp.addCookie(at);

        Cookie rt = new Cookie("refresh_token", "");
        rt.setMaxAge(0);
        rt.setPath("/");
        resp.addCookie(rt);

        // Redirect to login page
        resp.sendRedirect("login.jsp");
    }
}
