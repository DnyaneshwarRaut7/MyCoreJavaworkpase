package com.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable1 {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();
			String sql = "create table emp(id int ,name varchar(20),address varchar(40))";

			Statement smt = connection.createStatement();

			smt.execute(sql);
			connection.close();
			
			System.out.println("create table");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	
}
