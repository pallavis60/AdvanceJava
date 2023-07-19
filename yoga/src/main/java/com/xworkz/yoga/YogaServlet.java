package com.xworkz.yoga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.yoga.dto.YogaDto;
import com.xworkz.yoga.service.YogaService;
import com.xworkz.yoga.service.YogaServiceImpl;

@WebServlet(urlPatterns = "/send",loadOnStartup=2)
public class YogaServlet extends HttpServlet {

	public YogaServlet() {
		System.out.println("Constructor from YogaServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do post method");

		YogaDto dto = new YogaDto();
		dto.setName(req.getParameter("name"));
		dto.setGender(req.getParameter("gender"));
		dto.setCity(req.getParameter("city"));
		dto.setAge(req.getParameter("age"));
		dto.setMotive(req.getParameter("motive"));
		dto.setExperience(req.getParameter("experience"));
		dto.setWeight(req.getParameter("weight"));
		dto.setHeight(req.getParameter("height"));
		dto.setType(req.getParameter("type"));
		dto.setEmail(req.getParameter("email"));
		dto.setNumber(req.getParameter("number"));

		String name = req.getParameter("name");
		System.out.println(dto);

		YogaService service = new YogaServiceImpl();
		//service.save(dto);
		

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>    Welcome         "  +name+ "</h1>");
		
		

	}

}
