package com.iu.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
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
		EmployeesView employeesView = new EmployeesView();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		
//		try {
//			RegionsDTO regionsDTO = regionsDAO.getDetail(4);
//			regionsView.view(regionsDTO);
//			regionsView.view(regionsDAO.getList());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			RegionsDTO regionsDTO = new RegionsDTO();
//			regionsDTO.setRegion_id(6);
//			regionsDTO.setRegion_name("Mars");
//			int result = regionsDAO.setRegion(regionsDTO);
//			if(result>0) {
//				System.out.println("성공했습니다");
//			} else {
//				System.out.println("실패했습니다");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			CountriesDTO countriesDTO = new CountriesDTO();
//			countriesDTO.setCountry_id("SE");
//			countriesDTO.setCountry_name("Sweden");
//			countriesDTO.setRegion_id(1);
//			int result = countriesDAO.setCountry(countriesDTO);
//			if(result>0) {
//				System.out.println("성공했습니다");
//			} else{
//				System.out.println("실패했습니다");
//			}
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			try {
//				CountriesDTO countriesDTO = countriesDAO.getDetail("US");
//				countriesView.view(countriesDTO);
//				countriesView.view(countriesDAO.getList());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				EmployeesDTO employeesDTO = employeesDAO.getDetail(100);
//				employeesView.view(employeesDTO);
//				employeesView.view(employeesDAO.getList());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//		try {
//			employeesDAO.getSalaryInfo();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			}

}
