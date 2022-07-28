package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public int setCountry (CountriesDTO countriesDTO) throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO COUNTRIES VALUES (?, ?, ?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, countriesDTO.getCountry_id());
		st.setString(2, countriesDTO.getCountry_name());
		st.setInt(3, countriesDTO.getRegion_id());
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;		
	}
	
	public CountriesDTO getDetail(String country_id) throws Exception {
		CountriesDTO countriesDTO = null;
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		//1.
		//String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID='%'||?||'%'";
		PreparedStatement st = con.prepareStatement(sql);
		//2.
		st.setString(1, "%"+country_id+"%");
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
		countriesDTO = new CountriesDTO();
		String cid = rs.getString("COUNTRY_ID");
		countriesDTO.setCountry_id(cid);
		String cName= rs.getString("COUNTRY_NAME");
		countriesDTO.setCountry_name(cName);
		int rid = rs.getInt("REGION_ID");
		countriesDTO.setRegion_id(rid);
				}
		DBConnector.disConnect(rs, st, con);
		
		return countriesDTO;
		}
	
	public ArrayList<CountriesDTO> getList() throws Exception {
		//1. DB연결
		//2. QUERY문 작성
		//3. 미리 전송
		//4. 최종 전송 후 결과 처리
		CountriesDTO countriesDTO = null;
		ArrayList<CountriesDTO> ac = new ArrayList();
				
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
				
		while(rs.next()) {
			countriesDTO = new CountriesDTO();
			String cid = rs.getString("COUNTRY_ID");
			countriesDTO.setCountry_id(cid);
			String cName = rs.getString("COUNTRY_NAME");
			countriesDTO.setCountry_name(cName);
			int rid = rs.getInt("REGION_ID");
			countriesDTO.setRegion_id(rid);
			ac.add(countriesDTO);
		}
		DBConnector.disConnect(rs, ps, con);
		return ac;
	}

}
