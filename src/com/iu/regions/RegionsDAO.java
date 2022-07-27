package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	//1. Regions의 모든 데이터를 가져오기
	//2. REGIONS에서 하나의 결과(Row) 가져오기
	public RegionsDTO getDetail(int region_id) throws Exception {
		//1. DB연결
		//2. Query문 작성
		//3. 미리 전송
		//4. ?값 세팅
		//* WHERE NUM BETWEEN ? AND ?; 이런 Query문이 나왔다면
		//   st.setInt(1, 10000)-> 1번 물음표에 10000을 넣고
		//   st.setInt(2, 20000)-> 2번 물음표에 20000을 넣어라
		//5. 최종 전송 후 결과 처리하기
		
		RegionsDTO regionsDTO = null;
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID =?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, region_id);//Oracle은 1번부터 인덱스 시작
		
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next()) {
			regionsDTO = new RegionsDTO();
			int rid = rs.getInt(1);
			regionsDTO.setRegion_id(rid);
			String rName = rs.getString(2);
			regionsDTO.setRegion_name(rName);
			
		}
		DBConnector.disConnect(rs, st, con);
		return regionsDTO;
		
	}
	public ArrayList<RegionsDTO> getList() throws Exception {
		RegionsDTO regionsDTO = null;
		ArrayList<RegionsDTO> ar = new ArrayList();
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
			regionsDTO = new RegionsDTO();
			int id = rs.getInt("REGION_ID");
			regionsDTO.setRegion_id(id);
			String name = rs.getString("REGION_NAME");
			regionsDTO.setRegion_name(name);
			ar.add(regionsDTO);
							}
		DBConnector.disConnect(rs, st, con);

		return ar;
	}
	
	

}
