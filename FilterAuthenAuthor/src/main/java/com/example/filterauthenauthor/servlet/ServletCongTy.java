package com.example.filterauthenauthor.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletCongTy",
        value = {
                "/quan-ly/hien-thi",
                "/nhan-vien/hien-thi"

})
public class ServletCongTy extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/quan-ly/hien-thi")){
            request.getRequestDispatcher("/demo-filter/quan-ly.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/demo-filter/nhan-vien.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
