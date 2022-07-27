package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {

	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ae = new ArrayList();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement st = con.prepareStatement(sql);
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
		DBConnector.disConnect(rs, st, con);
	return ae;
	}
	
	public EmployeesDTO getDetail (int employee_id) throws Exception {
		EmployeesDTO employeesDTO = null;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, employee_id);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
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
		DBConnector.disConnect(rs, st, con);
		return employeesDTO;
		}
}
