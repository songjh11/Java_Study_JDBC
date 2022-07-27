package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	//1. Regions의 모든 데이터를 가져오기
	
	public void getList() throws Exception {
		//1. 로그인하기
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문을 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 
				
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("REGION_ID");
			String name = rs.getString("REGION_NAME");
			System.out.println(id);
			System.out.println(name);
				}
	
	
	}
	//2. 

}
