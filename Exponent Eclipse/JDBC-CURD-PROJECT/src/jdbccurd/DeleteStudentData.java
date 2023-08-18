package jdbccurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudentData {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curdjdbc", "root", "root");

			String sql = "delete from student where id=1";

			Statement smt = connection.createStatement();

			smt.executeUpdate(sql);

			connection.close();

			System.out.println("Delete record Successfully ....!");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
