package com.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord1 {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();

			String sql = "insert into emp values(103,'tushar','pimperi')";

			Statement smt = connection.createStatement();

			smt.execute(sql);

			connection.close();
			System.out.println("insert record sucess....");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
