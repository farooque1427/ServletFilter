package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addstudent")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 2997722659517974494L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("StudentServlet::doGet() called.");
		//Get writer
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//Get Parameter
		String name = req.getParameter("name");
		int rno = Integer.parseInt(req.getParameter("rno"));
		
		out.print("<center>");
		out.print("<h1>Welcome to JAVA World.</h1>");
		out.print("<p>Student "+ name +" Added Successfully with Roll no: "+ rno+"</p><br>");
		out.print("<a href='index.jsp'>Home</a>");
		out.print("<center>");
		out.print("</center>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("StudentServlet::doPost() called.");
		doGet(req, resp);
	}

}
