package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord { 

	public static void main(String[] args) {

		try {
			// 1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// 2. create the connection/// url username password
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// 3.bulid the query
			String sql = "delete from employee1 where id=12";

			// 4.create the statement
			Statement smt = connection.createStatement();

			// 5. execute the query
			int count = smt.executeUpdate(sql);

			// 6.connection close
			connection.close();

			System.out.println("delete recort count :" + count);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
