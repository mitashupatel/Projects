package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/interview";
		String uname = "root";
		String pass = "root";
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection(url,uname,pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Datbase Connection Succesful");
		return conn;
		
	}
}
