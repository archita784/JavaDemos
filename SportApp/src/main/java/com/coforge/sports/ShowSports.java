package com.coforge.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowSports {

	public static void main(String[] args) {
		
		String sql = "select * from msports";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "2020";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				int sportsId = rs.getInt(2);
				int playercount = rs.getInt(4);
				String coach = rs.getString("coach");
				System.out.println(name + "\t" + sportsId + "\t"+playercount+"\t" + coach);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}


}
