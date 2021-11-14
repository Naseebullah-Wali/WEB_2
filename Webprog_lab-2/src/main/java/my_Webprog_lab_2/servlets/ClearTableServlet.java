package my_Webprog_lab_2.servlets;

import my_Webprog_lab_2.beans.EntriesBeans;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class ClearTableServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EntriesBeans entries = (EntriesBeans) request.getSession().getAttribute("entries");
        if (entries == null) entries = new EntriesBeans();
        entries.getEntries().clear();
        request.getSession().setAttribute("entries", entries);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

