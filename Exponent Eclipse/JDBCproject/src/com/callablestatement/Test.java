package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.SingletonDesignPattern.MyConnection;

public class Test {// select query

	public static void main(String[] args) {

		try {
			// connection single ton desine pattern
			Connection connection = MyConnection.getConnection();

			// callablestarement calling
			CallableStatement cs = connection.prepareCall("{call get_emp_details()}");

			// select query
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				
				System.out.println("...............");

				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("sucess....");
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
