package co.coforge.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) {
		// link and load the driver
		
		String sql = "insert into Mobile values('samsung',1001,'A63O')";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "2020";
		Connection connection = null;
		Statement statement = null;
		// establish a connection
		try {
			connection = DriverManager.getConnection(url, userName, password);
			
			
			statement = connection.createStatement();
			Scanner sc =new Scanner (System.in);
			String city=sc.next();
			String Sql="update costudent set city=' "+ city +"' where studId>12";
			boolean result = statement.execute(sql);
			System.out.println("inserted " + result);
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
