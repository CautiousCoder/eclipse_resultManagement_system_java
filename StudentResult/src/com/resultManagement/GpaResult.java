package com.resultManagement;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.dbConecction;

public class GpaResult {
	dbConecction c = new dbConecction();
	public GpaResult() {
		
	}
	double strlt(double gpa, double credit) {
		return gpa*credit;
	}
	
	double getsgpa(String q) {
		double result=0.00;
		ResultSet rs = null;
		try {
			rs = (ResultSet) c.state.executeQuery(q);
			rs.next();
			result = rs.getDouble(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void main() {
		new GpaResult();
	}

}
