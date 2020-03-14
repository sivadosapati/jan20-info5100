import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataTest {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC", "root", "Test1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from test;");

		while (rs.next()) {
			System.out.println(rs.getString(1) + " -> " + rs.getString(2));
		}
	}

}
