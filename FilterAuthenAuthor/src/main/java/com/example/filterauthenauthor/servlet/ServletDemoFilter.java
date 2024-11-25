package com.example.filterauthenauthor.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletDemoFilter",
        value =
                {
                        "/demo-filter/login",
                        "/demo-filter/logout",
                })
public class ServletDemoFilter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/demo-filter/login")){
            request.getRequestDispatcher("/demo-filter/login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.invalidate(); // lệnh huỷ session
            response.sendRedirect("/demo-filter/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        HttpSession session = request.getSession();
        if (userName.equals("ql") && passWord.equals("ql")) {
            session.setAttribute("username", "ql");
            session.setAttribute("role","ql");
            response.sendRedirect("/quan-ly/hien-thi");
        } else if (userName.equals("nv") && passWord.equals("nv")) {
            session.setAttribute("username", "nv");
            session.setAttribute("role", "nv");
            response.sendRedirect("/nhan-vien/hien-thi");
        } else {
            request.setAttribute("message", "Thông tin đăng nhập sai");
            request.getRequestDispatcher("/demo-filter/login.jsp").forward(request, response);
        }
    }
}
