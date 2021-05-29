package com.coforge.prepareDemo;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) {
		// link and load the driver
		//Scanner sc =new Scanner (System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName= "system";
		String password = "2020";
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			String sql = "insert into costudent values(?,?,?)";
			
			ps = connection.prepareStatement(sql);
			ps.setString(1, "Rati");
			ps.setInt(2,11);
			ps.setString(3, "Banglore");
			ps.execute(sql);
			ps.execute();
		
			
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
