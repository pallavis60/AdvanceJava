package com.xworkz.youtube;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getting" ,loadOnStartup = 1)
public class YoutubeServlet extends HttpServlet {
	
	public YoutubeServlet() {
		System.out.println("Construtor from servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Do Method is running........");
	}

}
