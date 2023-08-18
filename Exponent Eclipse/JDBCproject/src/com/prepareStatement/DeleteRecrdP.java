package com.prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.SingletonDesignPattern.MyConnection;

public class DeleteRecrdP {

	public static void main(String[] args) {

		try {
			Connection connection = MyConnection.getConnection();
			String sql = "delete from emp where id = ?";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your emp id:");
			int id = sc.nextInt();
		PreparedStatement ps =	connection.prepareStatement(sql);
		
		ps.setInt(1, id);
		
	int count =	ps.executeUpdate();
	
	System.out.println(count);
		
		System.out.println("delete record...");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
