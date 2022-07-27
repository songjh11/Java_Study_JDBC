package com.iu.regions;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.countries.CountriesDAO;

public class RegionsView {

	//view메서드 생성
	//
	
	public void view(RegionsDTO regionsDTO) throws Exception {
			System.out.println(regionsDTO.getRegion_id());
			System.out.println(regionsDTO.getRegion_name());
	}
	
	public void view(ArrayList<RegionsDTO> ar) {
			System.out.println("REGION_ID"+"       REGION_NAME");
		for (RegionsDTO rd: ar) {
			System.out.println(rd.getRegion_id()+"\t"+"\t"+rd.getRegion_name());
					}
	}
	
}
