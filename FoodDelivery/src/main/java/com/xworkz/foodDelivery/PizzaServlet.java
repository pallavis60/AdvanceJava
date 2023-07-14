package com.xworkz.foodDelivery;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.foodDelivery.dto.FoodDto;
import com.xworkz.service.FoodService;
import com.xworkz.service.FoodServiceImpl;

@WebServlet(urlPatterns = "/send")
public class PizzaServlet extends HttpServlet {

	public PizzaServlet() {
		System.out.println("Constructor from PizzaServlet....................");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Calling do post method...................");

		FoodDto dto = new FoodDto();
	    dto.setPizzaName(req.getParameter("pizzaName"));
		dto.setType(req.getParameter("type"));
		dto.setLocation(req.getParameter("location"));
		dto.setPaymentMode(req.getParameter("paymentmode"));
		System.out.println(dto);
		
		FoodService service = new FoodServiceImpl();
			boolean saving=service.save(dto);
		System.out.println(saving);
		
		resp.setContentType("Text/Html");
		PrintWriter write=resp.getWriter();
		write.println(dto);
		
	}

}
