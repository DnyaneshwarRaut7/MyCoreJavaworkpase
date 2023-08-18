package com.exponent.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.classmanagementconnection.Myconnection;
import com.exponent.model.Facult;
import com.exponent.service.ClassManagementSystemService;

public class ClassManagementSystemServiceimpl implements ClassManagementSystemService {

	Connection connection;
	PreparedStatement ps;

	@Override
	public void addCourcetoDatabase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many course you want to add :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter course cid:");
			int cid = sc.nextInt();

			System.out.println("Enter course cname:");
			String cname = sc.next();
			try {
				connection = Myconnection.getconnection();
				String sql = "insert into course values(?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, cid);
				ps.setString(2, cname);
				ps.executeUpdate();
				System.out.println("------Course Sucessful Insert------");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	@Override
	public void displayCourcefromDatabase() {

		try {
			connection = Myconnection.getconnection();
			String sql = "select * from course";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql); 

			while (rs.next()) {

				System.out.println("course id :-  " + rs.getInt(1) + "   course name :-  " + rs.getString(2));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void addFaculttoDatabase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many faculty you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Faculty fid:");
			int fid = sc.nextInt();
			System.out.println("Enter Faculty Fname:");
			String fname = sc.next();

			displayCourcefromDatabase();
			System.out.println("Please select Cource for  faculty");
			int cid = sc.nextInt();

			try {
				connection = Myconnection.getconnection();
				String sql = "insert into Facult values (?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, fid);
				ps.setString(2, fname);
				ps.setInt(3, cid);
				ps.executeUpdate();
				System.out.println("Faculty Sucessful Insert..");

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void displayFacultfromDatabase() {

		try {

			connection = Myconnection.getconnection();
			String sql = "select f.fid,f.fname,c.cid,c.cname from facult f inner join course c on f.cid=c.cid";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);
			Facult facult = new Facult();
			while (rs.next()) {

				System.out.println("Faculty id:-  " + rs.getInt(1) + "  Faculty Name:- " + rs.getString(2)
						+ " course id :-  " + rs.getInt(3) + "  course Name:- " + rs.getString(4));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addBatchtoDatabase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Batch you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Batch bid:");
			int bid = sc.nextInt();
			System.out.println("Enter Batch bname:");
			String bname = sc.next();

			displayFacultfromDatabase();
			System.out.println("Please Enter Faculty for fid");
			int fid = sc.nextInt();

			try {
				connection = Myconnection.getconnection();
				String sql = "insert into batch values (?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, bid);
				ps.setString(2, bname);
				ps.setInt(3, fid);
				ps.executeUpdate();
				System.out.println("Batch Sucessful Insert");

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

	}

	@Override
	public void displayBatchfromDatabase() {

		try {

			connection = Myconnection.getconnection();
			String sql = "select b.bid,b.bname,f.fid,f.fname,c.cid,c.cname from batch b inner join facult f on b.fid=f.fid inner join course c on f.cid=c.cid ";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {

				System.out.println("batch bid :-  " + rs.getInt(1) + "  batch bname :-  " + rs.getString(2)
						+ "  Faculty id:-  " + rs.getInt(3) + "  Faculty Name:- " + rs.getString(4) + " course id :-  "
						+ rs.getInt(5) + "  course Name:- " + rs.getString(6));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void addStudenttoDatabase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Student you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student sid:");
			int sid = sc.nextInt();
			System.out.println("Enter Student sname:");
			String sname = sc.next();

			displayBatchfromDatabase();
			System.out.println(" please Enter your Batch bid");
			int bid = sc.nextInt();

			try {

				connection = Myconnection.getconnection();
				String sql = "insert into student values (?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, sid);
				ps.setString(2, sname);
				ps.setInt(3, bid);
				ps.executeUpdate();
				System.out.println("-------- Student Sucessful Insert-------");

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void displayStudentfromDatabase() {

		try {

			connection = Myconnection.getconnection();
			String sql = "select s.sid,s.sname,b.bid,b.bname,f.fid,f.fname,c.cid,c.cname from Student s inner join batch b on s.bid=b.bid inner join facult f on b.fid=f.fid inner join Course c on f.cid=c.cid ";
			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {

				System.out.println("Student sid :- " + rs.getInt(1) + "  Student sname :-  " + rs.getString(2)
						+ "  batch bid :-  " + rs.getInt(3) + "  batch bname :-  " + rs.getString(4) + "  Faculty id:-  "
						+ rs.getInt(5) + "  Faculty Name:- " + rs.getString(6) + " course id :-  " + rs.getInt(7)
						+ "  course Name:- " + rs.getString(8));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
