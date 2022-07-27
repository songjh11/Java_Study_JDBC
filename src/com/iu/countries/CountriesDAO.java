package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public void getList() throws ClassNotFoundException, SQLException {
		//1. DB연결
		//2. QUERY문 작성
		//3. 미리 전송
		//4. 최종 전송 후 결과 처리
		
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		int i=1;
		
		while(rs.next()) {
			String cid = rs.getString("COUNTRY_ID");
			String cName = rs.getString("COUNTRY_NAME");
			int rid = rs.getInt("REGION_ID");
			System.out.println(i+++"번째");
			System.out.println("COUNTRY_ID: "+cid);
			System.out.println("COUNTRY_NAME: "+cName);
			System.out.println("REGION_ID: "+rid);
			System.out.println("=======================");
		}
	}

}
