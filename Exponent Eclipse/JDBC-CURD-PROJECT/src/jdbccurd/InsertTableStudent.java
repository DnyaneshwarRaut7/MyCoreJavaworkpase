package jdbccurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTableStudent {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdjdbc", "root", "root");

			String query = "insert into Student values(4,'ritesh','vashi')";

			Statement smt = connection.createStatement();

			smt.execute(query);

			connection.close();
			System.out.println("Student Table Record Inserted Successfully ....!");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
