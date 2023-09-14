package com.dmdev.http.pac1.servlet;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Stream;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Считывание / передача - параметров
//        var header1 = req.getHeader("user-agent");
//
//        var headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            var header = headerNames.nextElement();
//            System.out.println(req.getHeader(header));
//        }
//
//        resp.setContentType("text/html; charset=UTF-8");
//        resp.setHeader("token", "12345");

        var paramValue = req.getParameter("param");
        var parameterMap = req.getParameterMap();
        System.out.println();

        try (var writer = resp.getWriter()) {
            writer.write("<h1>Hello from First Servlet</h1>");
//            writer.write("<h1>User from :</h1>" + header1.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        var parameterMap = req.getParameterMap();
//        System.out.println(parameterMap);

        // Body text request
        try (var reader = req.getReader();
             var lines = reader.lines()) {
            lines.forEach(System.out::println);
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

}
