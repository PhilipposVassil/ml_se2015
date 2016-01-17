package com.HRManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

	private static Connection conn;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/test1";
	static final String USER = "root";
	static final String PASS = "";
	
	public static Connection connectDB(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static ResultSet executeQuery(String query, Connection conn){
		Statement stmt;
		
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				stmt.execute(query);
				return stmt.getResultSet();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static boolean executeUpdate(String query, Connection conn){
		Statement stmt;
		
		if (conn != null) {
			try {
				stmt = conn.createStatement();
				int result = stmt.executeUpdate(query);
				stmt.close();
				if (result > 0){
					return true;
				}
				else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
