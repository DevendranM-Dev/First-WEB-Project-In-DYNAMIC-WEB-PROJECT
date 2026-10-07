package com.rc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/myServlet")  //url
public class MyServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("My Servlet Is Service () Invoked!");
		
		//req  -- request
		//resp  -- response
		String name =req.getParameter("name");
		System.out.println("Name is : "+name);
		
		String country = req.getParameter("country");
		System.out.println("Country is : "+country);
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		writer.println("We Got Response Sucessfully!!!");
		writer.println("<h1> My Name is : "+name+"</h1>");
		writer.println("<h1> My Country is : "+country+"</h1>");
		
		
	}
	
	

}
