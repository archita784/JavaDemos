package co.coforge.training;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		// link and load the driver
		String sql = "create table costudent(name varchar(20), studId integer primary key, city varchar(20))";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "2020";
		Connection connection = null;
		Statement statement = null;
		// establish a connection

		try {
			connection = DriverManager.getConnection(url, userName, password);

			// create a statement object
			statement = connection.createStatement();
			// execute the statement and pass the query
			boolean result = statement.execute(sql);
			System.out.println("table created " + result);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}