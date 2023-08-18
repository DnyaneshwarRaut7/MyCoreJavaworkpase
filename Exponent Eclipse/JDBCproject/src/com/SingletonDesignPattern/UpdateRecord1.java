 package com.SingletonDesignPattern;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateRecord1 {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();

			String sql = "update emp set id = 102  where name = 'sumit'";

			Statement smt = connection.createStatement();

			int count = smt.executeUpdate(sql);

			connection.close();
			System.out.println("update record count :" + count);

		} catch (Exception e) {
		}

	}

}
