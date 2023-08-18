package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecort {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String sql = "select * from employee1";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {

				System.out.println("****************");

				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getInt("sallary"));

				// System.out.println(rs.getInt(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));
				// System.out.println(rs.getInt(4));

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
