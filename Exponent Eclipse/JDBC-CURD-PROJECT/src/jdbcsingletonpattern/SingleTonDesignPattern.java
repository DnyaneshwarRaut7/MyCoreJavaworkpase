package jdbcsingletonpattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleTonDesignPattern {

	// Globally declare connection
	// static
	// declare the null
	// static method direct call
	private static Connection connection = null;

	// private constature
	// we can not create instance/object for other class
	private SingleTonDesignPattern() {
	}

	// Static method create direct class name call the method other class
	// return type connection
	public static Connection getConnection() {

		if (connection == null) {
			try {

				Class.forName("com.mysql.jdbc.Driver");

				Connection connection = DriverManager.getConnection("jbdc:mysql://localhost:3306/curdjdbc", "root",
						"root");

				return connection;

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return connection;

	}

}
