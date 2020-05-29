package org.IPASS.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testdatumForm")
public class TestForm extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String zoekDatum = request.getParameter("zoekDatum");
        System.out.println("datum: " + zoekDatum);

        PrintWriter writer = response.getWriter();

        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your date is: " + zoekDatum + "<br/>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);
    }
}
