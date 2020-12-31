package com.mitashu.utills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/interview/user";
		String user = "root";
		String password = "root";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}
}
