package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	public void getSalaryInfo() throws Exception {
		EmployeesDTO employeesDTO = null;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) as MAX FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
//			employeesDTO = new EmployeesDTO();
			Integer sumS = rs.getInt("SUM(SALARY)");
			Double avgS = rs.getDouble("AVG(SALARY)");
			Integer maxS = rs.getInt("MAX");
			System.out.println("합계: "+sumS+"\t평균: "+avgS+"\t최고 급여액: "+maxS);
					}
		DBConnector.disConnect(rs, st, con);
		}

	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ae = new ArrayList();
		//1.DB연결
		Connection con = DBConnector.getConnection();
		//2. Query문 작성
		String sql = "SELECT * FROM EMPLOYEES";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
		EmployeesDTO employeesDTO = new EmployeesDTO();		
		employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
		employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
		employeesDTO.setLast_name(rs.getString("LAST_NAME"));
		employeesDTO.setEmail(rs.getString("EMAIL"));
		employeesDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
		employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
		employeesDTO.setJob_id(rs.getString("JOB_ID"));
		employeesDTO.setSalary(rs.getInt("SALARY"));
		employeesDTO.setComission_pct(rs.getInt("COMMISSION_PCT"));
		employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
		employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		ae.add(employeesDTO);
			}//while
		//5. 자원 해제
		DBConnector.disConnect(rs, st, con);
	return ae;
	}
	
	public EmployeesDTO getDetail (int employee_id) throws Exception {
		EmployeesDTO employeesDTO = null;
		//1.DB연결
		Connection con = DBConnector.getConnection();
		//2. Query문 작성
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?가 있으면 값 세팅
		st.setInt(1, employee_id);
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("EMAIL"));
			employeesDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getInt("SALARY"));
			employeesDTO.setComission_pct(rs.getInt("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		}
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		return employeesDTO;
		}
}
