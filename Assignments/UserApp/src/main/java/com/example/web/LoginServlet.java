package com.example.web;

import com.example.dao.UserDAO;
import com.example.model.User;
import com.example.util.JwtUtil;
import com.example.util.PasswordUtil;
import com.example.util.RedisUtil;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            UserDAO dao = new UserDAO();
            User u = dao.findByEmail(email);

            if(u != null && PasswordUtil.verify(password, u.getPassword())) {
                // Invalidate previous session
                RedisUtil.deleteSession(u.getId());

                HttpSession session = req.getSession(true);
                session.setAttribute("userId", u.getId());
                session.setAttribute("userName", u.getName());

                RedisUtil.saveSession(u.getId(), session.getId(), 30*60);

                // Tokens
                String accessToken = JwtUtil.generateAccessToken(u);
                String refreshToken = JwtUtil.generateRefreshToken(u);

                RedisUtil.saveAccessToken(accessToken, u.getId(), 5*60);//
                RedisUtil.saveRefreshToken(refreshToken, u.getId(), 7*24*60*60);

                // Cookies
                Cookie at = new Cookie("access_token", accessToken);
                at.setHttpOnly(true);
                at.setPath("/");
                resp.addCookie(at);

                Cookie rt = new Cookie("refresh_token", refreshToken);
                rt.setHttpOnly(true);
//                rt.setHttpOnly(true);        // Prevent JS access
//                rt.setSecure(true);          // Only over HTTPS
//                rt.setPath("/");
//                rt.setMaxAge(300);           // 5 minutes
//                rt.setSameSite("Strict");    // Prevent CSRF
                rt.setPath("/");
                resp.addCookie(rt);
                System.out.println("Access Token: " + accessToken);
                System.out.println("Refresh Token: " + refreshToken);

                if(u.isIs_admin()) {
                    resp.sendRedirect("admin_users");
                } else {
                    resp.sendRedirect("dashboard");
                }
            } else {
                req.setAttribute("error","Invalid credentials");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
        } catch(Exception e) {
            throw new ServletException(e);
        }
    }
}
