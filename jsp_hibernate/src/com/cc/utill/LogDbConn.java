package com.cc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogDbConn {
		public static Connection getConnection() {
				
			String url="jdbc:mysql://localhost:3306/log";
			String uname="root";
			String pass="root";
			
			Connection conn= null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn= DriverManager.getConnection(url,uname,pass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
		}
}
