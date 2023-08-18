package jdbccurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdjdbc", "root", "root");

			String sql = "create table Student(id int,name varchar(90),address varchar(80))";

			Statement smt = connection.createStatement();

			smt.execute(sql);

			connection.close();

			System.out.println("Create table successfully ....!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
