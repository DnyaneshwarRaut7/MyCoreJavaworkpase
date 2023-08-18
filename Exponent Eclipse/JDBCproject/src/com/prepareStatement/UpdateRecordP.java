package com.prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.SingletonDesignPattern.MyConnection;

public class UpdateRecordP {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();

			String sql = "update emp set name = ? where id = ?";
			Scanner sc = new Scanner(System.in);

			System.out.println("enter your emp name :");
			String name = sc.next();

			System.out.println("enter your emp id :");
			int id = sc.nextInt();

			PreparedStatement ps = connection.prepareStatement(sql);

			
			ps.setString(1, name);
			ps.setInt(2, id);

			ps.executeUpdate();

			System.out.println("updated");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
