package com.example.filterauthenauthor.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletDemoSessionScope",
        value =
                {       "/demo-session",
                        "/hien-thi-session",
                })
public class ServletDemoSessionScope extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/demo-session")){
            HttpSession session = request.getSession();
            session.setAttribute("name","From demo session");
        } else {
            request.getRequestDispatcher("/view/hien-thi.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
