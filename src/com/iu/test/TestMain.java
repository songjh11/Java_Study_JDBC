package com.iu.test;

import java.sql.SQLException;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		RegionsDAO regionsDAO  = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
//		try {
//			regionsDAO.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			countriesDAO.getList();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
