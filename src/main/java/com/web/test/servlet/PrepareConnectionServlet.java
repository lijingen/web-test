package com.web.test.servlet;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrepareConnectionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void init() throws ServletException {
        
        ServletContext context = getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        int a = 1;
        String c="1"+"3"+
                "4";
        if (a ==1){

        }
        System.out.println("test:"+username+",password"+password);
        context.setAttribute("username", username);
        context.setAttribute("password", password);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost:request"+request);
        response.sendRedirect("http://www.baidu.com");
    }
}