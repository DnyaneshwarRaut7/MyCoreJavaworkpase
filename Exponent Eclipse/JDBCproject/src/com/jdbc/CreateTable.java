package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		System.out.println("--- creare table ------ ");

		try {

			// 1. load the manager

			Class.forName("com.mysql.jdbc.Driver");

			// 2. create the connection/// url username password

			Connection connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			// 3.build the sql query

			String sql = "create table employee1(id int,name varchar(20),address varchar(50),sallary int)";

			// 4. create the statement

			Statement smt = connections.createStatement();
			// 5. Execute the query
			smt.execute(sql);
			// 6. get the connection
			connections.close();
			System.out.println("success...");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
