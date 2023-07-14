package com.xworkz.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")

public class ResumeServlet extends HttpServlet {

	public ResumeServlet() {
		System.out.println("Constructor from ResumeServlet");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("DoGet Method from ResumeServlet");

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String contactNumber = req.getParameter("ContactNumber");
		String linkedIn = req.getParameter("LinkedInLink");
		String githubLink = req.getParameter("GithubLink");
		String qualification = req.getParameter("Qulaification");
		String skills = req.getParameter("Skills");
		String areaOfIntrest = req.getParameter("Area of intrest");
		String courseName = req.getParameter("CourseName");
		String projectName = req.getParameter("ProjectName");
		String jobrole = req.getParameter("Job role");

		System.out.println(firstName + "     " + lastName + "       " + email + "       " + contactNumber + "      "
				+ linkedIn + "       " + githubLink + "       " + qualification + "        " + skills + "       "
				+ areaOfIntrest + "       " + courseName + "      " + projectName + "       " + jobrole);
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println(" <h3>" +" "    + firstName);
		writer.println("<h3>" +" "+  lastName);  
		writer.println("<h3> "+" "+ email);
		writer.println("<h3" +" "+ jobrole); 
		writer.println("<h3>" +" " + projectName);
		
		
		writer.println("<form>\r\n"+"<input type=\"button\"value=\"Go back!\"onclick=\"history.back()\">\r\n"+"</form>");
		
		
		
	}
}
