package com.dmdev.http.pac1.servlet;

import com.dmdev.http.pac1.service.FlightService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/flights")
public class FlightServlet extends HttpServlet {

    private final FlightService flightService = FlightService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        try (var printwriter = resp.getWriter()) {
            printwriter.write("<h1>Список перелетов:</h1>");
            printwriter.write("<ul>");
            flightService.findAll().forEach(flightDto -> {
                printwriter.write("""
                        <li>
                            <a href="/tickets?flightId=%d">%s</a>
                        </li>
                        """.formatted(flightDto.getId(), flightDto.getDescription())
                );
            });
            printwriter.write("</ul>");
        }
    }
}
