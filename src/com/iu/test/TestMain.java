package com.iu.test;

import java.sql.SQLException;

import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
		DBConnector dbc = new DBConnector();
		
		try {
			dbc.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
