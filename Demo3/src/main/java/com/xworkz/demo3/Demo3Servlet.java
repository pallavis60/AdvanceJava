package com.xworkz.demo3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")

public class Demo3Servlet extends HttpServlet {
	
	public Demo3Servlet() {
		System.out.println("Demo project");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		// TODO Auto-generated method stub
		System.out.println("Do get method is running");
	}

}
