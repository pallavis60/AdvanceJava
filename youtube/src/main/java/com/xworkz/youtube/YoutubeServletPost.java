package com.xworkz.youtube;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send",loadOnStartup = 2)
public class YoutubeServletPost extends HttpServlet {
	
public YoutubeServletPost() {
	System.out.println("YoutubeServletPost.........");
	
}

@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("doPost method is calling");
	}

@Override
	public void doDelete(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("Do delete method");
	}

@Override
	public void doHead(HttpServletRequest arg0, HttpServletResponse arg1)  {
		System.out.println("Doheadmethod");
	}

@Override
	public void doOptions(HttpServletRequest arg0, HttpServletResponse arg1)  {
		System.out.println("Do option method");
	}

@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("Do put Method is running");
	}

}
