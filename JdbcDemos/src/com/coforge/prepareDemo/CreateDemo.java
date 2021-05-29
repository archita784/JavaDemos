package com.coforge.prepareDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		// link and load the driver
		String sql = "create table coemployee(name varchar(20), empId integer primary key, city varchar(20))";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "2020";
		Connection connection = null;
		PreparedStatement ps = null;
		// establish a connection

		try {
			connection = DriverManager.getConnection(url, userName, password);
			ps = connection.prepareStatement(sql);
			System.out.println("created"+ps.execute());
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}