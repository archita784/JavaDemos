package com.coforge.sports;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateSports {

	public static void main(String[] args) {
		// link and load the driver
		String sql = "create table msports(name varchar(20), sportsId integer primary key, coach varchar(20), playercount integer)";
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