package com.coforge.sports;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertSports {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName= "system";
		String password = "2020";
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
			String sql = "insert into msports values(?,?,?,?)";
			
			ps = connection.prepareStatement(sql);
			for (int i=0;i<4;i++) {
				System.out.println("Enter data");
				String name=sc.next();
				int sportsId=sc.nextInt();
				String coach=sc.next();
				int playercount=sc.nextInt();
			ps.setString(1, name);
			ps.setInt(2,sportsId);
			ps.setString(3, coach);
			ps.setInt(4,playercount);
			
			ps.execute();
			}
			
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
