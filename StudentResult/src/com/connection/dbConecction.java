package com.connection;
import java.sql.*;


public class dbConecction {
	Connection conn;
	public Statement state;

	public dbConecction() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/resultManagement","root","");
			state = conn.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
