package com.xworkz.instagram;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class InstagramServlet  extends HttpServlet{
	
	public InstagramServlet() {
		System.out.println("Constructor....");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("DoGet method is running");
	}

}
