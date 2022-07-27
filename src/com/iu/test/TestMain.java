package com.iu.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		RegionsDAO regionsDAO  = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		CountriesView countriesView = new CountriesView();
		
		try {
			RegionsDTO regionsDTO = regionsDAO.getDetail(2);
			regionsView.view(regionsDTO);
			regionsView.view(regionsDAO.getList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				CountriesDTO countriesDTO = countriesDAO.getDetail("US");
				countriesView.view(countriesDTO);
				countriesView.view(countriesDAO.getList());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
