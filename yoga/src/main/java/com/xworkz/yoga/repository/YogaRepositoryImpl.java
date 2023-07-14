package com.xworkz.yoga.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.yoga.dto.YogaDto;

public class YogaRepositoryImpl implements YogaRepository {

	@Override
	public boolean save(YogaDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yoga", "root", "Xworkzodc@123");
			System.out.println(con);

			String quary = "insert into yoga_info values(?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statment = con.prepareStatement(quary);

			statment.setString(1, dto.getName());
			statment.setString(2, dto.getGender());

			statment.setString(3, dto.getCity());

			statment.setString(4, dto.getAge());

			statment.setString(5, dto.getMotive());
			statment.setString(6, dto.getExperience());

			statment.setString(7, dto.getWeight());

			statment.setString(8, dto.getType());

			statment.setString(9, dto.getEmail());

			statment.setString(10, dto.getNumber());

			statment.setString(11, dto.getHeight());

			int i = statment.executeUpdate();
			if (i > 0) {
				System.out.println("Data is saved");
				return true;
			} else {
				System.out.println("Data is not saved");
			}

			statment.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean findByName(String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yoga", "root", "Xworkzodc@123");
			System.out.println(con);
			String quary = "Select * from yoga_info where name=?";
			PreparedStatement statment = con.prepareStatement(quary);

			statment.setString(1, name);

			ResultSet set = statment.executeQuery();

			if (set != null) {
				while (set.next()) {
					System.out.println(set.getString(1) + "    " + set.getString(2) + "     " + set.getString(3)
							+ "    " + set.getString(4) + "     " + set.getString(5) + "   " + set.getString(6)
							+ "     " + set.getString(7) + "   " + set.getString(8) + "   " + set.getString(9) + "   "
							+ set.getString(10) + "    " + set.getString(11));

					
				}

			}
			
			statment.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
