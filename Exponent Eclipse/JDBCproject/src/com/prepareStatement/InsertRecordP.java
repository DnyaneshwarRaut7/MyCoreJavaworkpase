package com.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public  class InsertRecordP {

	public static void main(String[] args) {

		try {
			// 1.driver class loder
			Class.forName("com.mysql.jdbc.Driver");
			// 2.drivermanager getconnection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			// 3.scanner object
			Scanner sc = new Scanner(System.in);

			System.out.println("enter your emp id :");
			int id = sc.nextInt();

			System.out.println("enter your emp name :");
			String name = sc.next();

			System.out.println("enter your emp address :");
			String address = sc.next();

			// 4. query build

			String sql = "insert into emp values(?,?,?)";

			// 5.preparesstatement connection

			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
//6.execute query
			ps.executeUpdate();
			System.out.println("record inserted");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
