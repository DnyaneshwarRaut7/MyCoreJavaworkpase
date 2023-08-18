package com.interfaceExample;

public class MYSQL implements MyDatabase {

	@Override
	public void commit() {

		System.out.println("=== mysql commit method ");
	}

	@Override
	public void rollback() {

		System.out.println("=== mysql rollback method ");

	}

	public static void main(String[] args) {
		System.out.println("<<<<< indirect object>>>>>");
		MyDatabase database = new MYSQL();// Lose coupling mysql / oracle
		database.commit();
		database.rollback();

		System.out.println("<<<<<< impliments object>>>>>>");

		MYSQL mysql = new MYSQL(); /// tight coupling
		mysql.commit();
		mysql.rollback();

		MyDatabase d = new OracleDatabase();// lose coupling
		database.commit();
		database.rollback();

	}

}
//abstraction of interface