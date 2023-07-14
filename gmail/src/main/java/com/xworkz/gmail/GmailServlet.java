package com.xworkz.gmail;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class GmailServlet extends HttpServlet {
	
	public GmailServlet() {
		System.out.println("GmailServlet constructor");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
	System.out.println("do get method from GmailServlet");	
	}

}
