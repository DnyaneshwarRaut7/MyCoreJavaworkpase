package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

import com.SingletonDesignPattern.MyConnection;

public class InoutRecord {

	public static void main(String[] args) {

		try {

			Connection connection = MyConnection.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your id :-");
			int eid = sc.nextInt();
			CallableStatement cs = connection.prepareCall("{call output_emp_details(?,?,?)}");
			cs.setInt(1, eid);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);

			// cs.getString("name");
			// cs.getString("address");

			ResultSet rs = cs.executeQuery();
			while (rs.next()) {

				System.out.println("Emp id:-" + eid);
				System.out.println("Emp name:-" + rs.getString("name"));
				System.out.println("Emp address:-" + rs.getString("address"));
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
