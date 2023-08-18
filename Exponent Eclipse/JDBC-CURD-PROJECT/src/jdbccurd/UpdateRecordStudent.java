package jdbccurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecordStudent {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdjdbc", "root", "root");

			String query = "update Student set name='mauli',address='pune' where id =1";

			Statement smt = connection.createStatement();

			smt.executeUpdate(query);

			connection.close();

			System.out.println("Updated Record Successfully ...!");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
