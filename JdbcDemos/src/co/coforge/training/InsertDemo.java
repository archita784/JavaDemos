package co.coforge.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
		// link and load the driver
		Scanner sc =new Scanner (System.in);
		String sql = "insert into costudent values('Ram',10,'Banglore')";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "2020";
		Connection connection = null;
		Statement statement = null;
		// establish a connection
		try {
		for (int i =0;i<4;i++) {
			System.out.println("Enter details");
			String name =sc.next();
			int id =sc.nextInt();
			String city=sc.next();
			String Sql="insert into costudent values('"+ name +"',"+id +",'"+city+"')";
			boolean result=statement.execute(sql);
			System.out.println("inserted"+ result);
		}
		
			connection = DriverManager.getConnection(url, userName, password);

			// create a statement object
			statement = connection.createStatement();
			// execute the statement and pass the query
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
