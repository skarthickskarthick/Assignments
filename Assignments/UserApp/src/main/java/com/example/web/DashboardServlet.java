package com.example.web;

import com.example.dao.UserDAO;
import com.example.model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null || session.getAttribute("userId") == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        try {
            UserDAO dao = new UserDAO();
            User u = dao.findById(userId);
            req.setAttribute("user", u);
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
        } catch(Exception e) {
            throw new ServletException(e);
        }
    }
}
