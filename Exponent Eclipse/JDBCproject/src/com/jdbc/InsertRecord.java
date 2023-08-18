package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {

		System.out.println("--- insert record -----");

		try {
			// 1. load the driver class

			Class.forName("com.mysql.jdbc.Driver");
			// 2. create the connection/// url username password

			Connection connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			// 3.build the sql query

			String sql = "insert into employee1 values(10,'rushi','khothrud',12000)";
			// 4.create the statement
			Statement smt = connections.createStatement();
			// 5. Execute the quarry
			smt.execute(sql);
			// 6.connection close
			connections.close();
			System.out.println("sucess...");

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
