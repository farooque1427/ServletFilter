package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NameFilter
 */
@WebFilter("/addstudent")
public class NameFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("NameFilter::doFilter() called.");
		HttpServletRequest req = (HttpServletRequest) request;
		String name = req.getParameter("name");
		if(name.length()>6)
			chain.doFilter(request, response);
		else {
			System.out.println("NameFilter:: Faild and go back to brouser.");
			out.print("<center>");
			out.print("<h1>Welcome to JAVA World.</h1>");
			out.print("Please Enter valid name(More than 5 alphabets)<br><br>");
			out.print("<a href='index.jsp'>Home</a>");
			out.print("</center>");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
