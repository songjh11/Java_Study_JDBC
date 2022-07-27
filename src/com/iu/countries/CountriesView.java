package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {
	
	public void view(CountriesDTO countriesDTO) {
		System.out.println(countriesDTO.getCountry_id());
		System.out.println(countriesDTO.getCountry_name());
		System.out.println(countriesDTO.getRegion_id());
	}

	public void view(ArrayList<CountriesDTO> ac) {
		System.out.println("COUNTRY_ID \tCOUNTRY_NAME  \t\tREGION_ID");		
		for(CountriesDTO cd: ac) {
			System.out.println(cd.getCountry_id()+"\t\t"+cd.getCountry_name()+"\t\t\t"+cd.getRegion_id());
				}
	}
}
