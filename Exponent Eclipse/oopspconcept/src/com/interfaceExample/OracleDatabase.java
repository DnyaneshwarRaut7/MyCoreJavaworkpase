package com.interfaceExample;

public class OracleDatabase implements MyDatabase {

	@Override
	public void commit() {

		System.out.println("<<<< oracle commit method>>>>>");
	}

	@Override
	public void rollback() {

		System.out.println(" <<<< oracle rollback method>>>>> ");
	}

}
//abstraction of interface