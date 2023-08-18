package com.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteRecord1 {

	public static void main(String[] args) {
	try {
		Connection connection =	MyConnection.getConnection();
		String sql = "delete from emp where id = 102";

		  Statement smt = connection.createStatement();
		  
		int count =  smt.executeUpdate(sql);

		connection.close();
		System.out.println("delete sucess.....");
			
	} catch (Exception e) {
		
		e.printStackTrace(); 
		
	}	

	
	
	}

}
