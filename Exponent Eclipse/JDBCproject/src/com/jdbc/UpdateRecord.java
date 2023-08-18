package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {

		try {
			
			// 1. load the driver class
			Class.forName("com.mysql.jdbc.Driver");
            // 2. create the connection/// url username password

			Connection connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
          // 3.build the sql query

			String sql = "update employee1 set id = 8 where address ='rahuri'";
           // 4 .create the statement
			Statement smt = connections.createStatement();
           // 5.execute the query 
			int count = smt.executeUpdate(sql);
           // 6. connection close
			connections.close();
			System.out.println("update recort count :"+count);

			System.out.println("update record");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
