package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.SingletonDesignPattern.MyConnection;

public class InsertRecords {

	public static void main(String[] args) {

	try {
		
	Connection connection =	MyConnection.getConnection();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter emp id :-");
	int eid = sc.nextInt();
	
	System.out.println("Enter emp Name:- ");
	String ename = sc.next();
	
	System.out.println("Enter emp Address:-");
	String address = sc.next();
	
CallableStatement cs = connection.prepareCall("{call insert_emp_details(?,?,?)}");

cs.setInt(1, eid);
cs.setString(2, ename);
cs.setString(3, address);
	
cs.execute();

System.out.println("inserted record...");
		
	} catch (Exception e) {

	   e.printStackTrace();
	}
	
	}

}
