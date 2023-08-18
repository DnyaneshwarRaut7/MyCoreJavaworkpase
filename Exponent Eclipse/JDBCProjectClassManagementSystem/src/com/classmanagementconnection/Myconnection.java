package com.classmanagementconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection {
	
	private static Connection connection = null;
	
	private Myconnection() {
		
		
	}
	public static Connection getconnection() {
		
		if(connection == null) {
			
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classmanagemetsystem","root","root");
	
			return connection;
	
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		}
		return connection;
		
		
		
	}

}
