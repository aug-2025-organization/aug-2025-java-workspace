package com.bms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn = null;
	
	// step 1
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// step 2
	static Connection makeConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	// step 5
	static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
