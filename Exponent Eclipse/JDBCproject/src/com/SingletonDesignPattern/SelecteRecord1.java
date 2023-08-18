package com.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelecteRecord1 {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();

			String sql = "select * from emp";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.println("*****************");

			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));
			
			}

		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
