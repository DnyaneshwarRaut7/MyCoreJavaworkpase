package jdbccurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudentRecord {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdjdbc", "root", "root");

			String sql = "select * from Student";

			Statement smt = connection.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				
				System.out.println("----------------------------");
				
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));
			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
