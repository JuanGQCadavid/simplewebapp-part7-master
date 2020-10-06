package com.javamaster.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public HomeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/")) {
            response.setContentType("application/xml");
            response.getWriter().println("<Response>Hola Servlet</Response>");
        }
        if (path.equals("/1")) {
            response.sendRedirect("http://cloud.zang.io/data/inboundxml/3ce76e1a353a539f25a99a8ebf0f98db8ec6e83f");
        }
        if (path.equals("/2")) {
            response.sendRedirect("http://cloud.zang.io/data/inboundxml/70bea44d2df496e06566e4122637d430d1a73011");
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.getWriter().println("Hello");
    }

}
