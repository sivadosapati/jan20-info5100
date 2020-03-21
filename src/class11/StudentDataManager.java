package class11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDataManager {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Test?serverTimezone=UTC", "root",
				"Test1234");
		Statement stmt = con.createStatement();
		
		String sql = "insert into Test.Student (roll,first,last) values(105,'Arch','Wu');";
		stmt.executeUpdate(sql);

		ResultSet r = stmt.executeQuery("select * from Test.Student;");
		while (r.next()) {
			System.out.println(r.getString(1) + " -> " + r.getString(2) + " -> " + r.getString(3));
		}

		r.close();
		stmt.close();
		con.close();

	}

}
