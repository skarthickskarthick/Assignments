package com.example.web;

import com.example.dao.UserDAO;
import com.example.model.User;
import com.example.util.PasswordUtil;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        //System.out.println("heello reg servlet"+ name);
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");

        User u = new User();
        u.setName(name);
        u.setEmail(email);
        u.setPhone(phone);
        u.setPassword(PasswordUtil.hash(password));
        u.setIs_admin(false);

        try {
            UserDAO dao = new UserDAO();
            dao.create(u);
            resp.sendRedirect("login.jsp");
        } catch(Exception e) {
            req.setAttribute("error","Email already exists or DB error");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            e.printStackTrace();
        }
    }
}
