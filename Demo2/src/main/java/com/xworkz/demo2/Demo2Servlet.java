package com.xworkz.demo2;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPattrens="/send")

public class Demo2Servlet extends HttpServlet {
	
	public Demo2Servlet() {
		System.out.println("Construtor form Demo2Servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("DoGet method is running");
	}

}
