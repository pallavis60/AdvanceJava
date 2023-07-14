package com.xworkz.foodDelivery.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.foodDelivery.dto.FoodDto;

public class FoodRepositoryImpl implements FoodRepository {

	@Override
	public boolean save(FoodDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDelivery", "root",
					"Xworkzodc@123");

			String quary = "Insert into food_info values(?,?,?,?)";

			System.out.println(quary);

			PreparedStatement statment = con.prepareStatement(quary);

			statment.setString(1, dto.getPizzaName());
			statment.setString(2, dto.getType());
			statment.setString(3, dto.getLocation());
			statment.setString(4, dto.getPaymentMode());

			int i = statment.executeUpdate();

			if (i > 0) {
				System.out.println("Data is saved");
				return true;
			} else {
				System.out.println("Data is not saved");
				return false;
			}

		}

		catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	  }
}
