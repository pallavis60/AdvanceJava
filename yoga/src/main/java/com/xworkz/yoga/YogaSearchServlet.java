package com.xworkz.yoga;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.yoga.dto.YogaDto;
import com.xworkz.yoga.service.YogaService;
import com.xworkz.yoga.service.YogaServiceImpl;

@WebServlet(urlPatterns = "/search", loadOnStartup = 2)
public class YogaSearchServlet extends HttpServlet {

	public YogaSearchServlet() {
		System.out.println("YogaSearchServlet constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String name = req.getParameter("name");

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yoga", "root", "Xworkzodc@123");
			System.out.println(con);
			String quary = "Select * from yoga_info where name=? ";
			PreparedStatement statment = con.prepareStatement(quary);
			statment.setString(1, name);

			ResultSet set = statment.executeQuery();

			if (set != null) {
				while (set.next()) {
					writer.println("<tr><td>");
					writer.println(set.getString(1));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(2));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(3));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(4));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(5));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(6));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(7));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(8));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(9));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(10));
					writer.println("</td>");
					writer.println("<td>");
					writer.println(set.getString(11));
					writer.println("</td>");

				}

			} else {
				writer.println("No such Name is found");
				System.out.println("No such name ");
				return;

			}

			statment.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
