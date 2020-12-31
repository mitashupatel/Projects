package com.admin.utills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/eximoo/admin";
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
