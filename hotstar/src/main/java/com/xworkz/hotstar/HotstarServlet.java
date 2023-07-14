package com.xworkz.hotstar;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class HotstarServlet extends HttpServlet {
	
	public HotstarServlet() {
		System.out.println("HotstarServlet constructor");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("doget method is running....");
		
	}

}
