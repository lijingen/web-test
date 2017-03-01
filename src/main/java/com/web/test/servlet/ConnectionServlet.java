package com.web.test.servlet;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ConnectionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        System.out.println("***************************************");
        System.out.println("Username: " + context.getAttribute("username"));
        System.out.println("Password: " + context.getAttribute("password"));
        System.out.println("***************************************");
        super.service(request, response);
    }
}