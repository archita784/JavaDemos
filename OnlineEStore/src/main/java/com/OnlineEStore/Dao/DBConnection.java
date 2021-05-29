package com.OnlineEStore.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	static Connection connection;

	public static Connection openconnection() {
		try {
			String Sql = "create table Item(itemId integer primary key,brand varchar(20),category varchar(20),price decimal, quantity integer, rating integer ,color varchar(20), memoryspecification varchar(20),discount integer)";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String username = "system";
			String password = "2020";
			connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement=connection.prepareStatement(Sql);
			//statement.execute();
			statement.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeconnection() {
		if (connection != null)
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("closeConnection");
	}

}
