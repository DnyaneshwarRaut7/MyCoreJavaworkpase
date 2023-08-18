package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		System.out.println("----- main methd ------");

		try {
			// 1. load the driver class

			Class.forName("com.mysql.jdbc.Driver");
			// 2. create the connection
			// Url username password

			Connection connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// 3.build the sql query

			String sql = "insert into student values(15,'banda','nigdi')";

			// 4. create the statement

			Statement smt = connections.createStatement();

			// 5.execute the query

			smt.execute(sql);

			// 6.close the connection

			connections.close();
			System.out.println("- sucess....");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
