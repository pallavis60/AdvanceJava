package com.xworkz.gpay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/send")
public class GPayServlet extends HttpServlet {
	
	public GPayServlet() {
		System.out.println("GPayServlet constructor");
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoGet Method from GPayClass");
		
		String userName= req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println(userName +"  "+email);
		
		
		
		resp.setContentType("text/html");
		PrintWriter write=resp.getWriter();
		write.println("Response is giving");
		write.println("<h2>Response is giving</h2>");
		
		write.println("Name"+"  " + userName );
		write.println("email"+"  " + email );

}
}
