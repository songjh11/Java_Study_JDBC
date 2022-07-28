package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {
	
	public void view(EmployeesDTO employeesDTO) {
		System.out.println("EMPLOYEE_ID: "+employeesDTO.getEmployee_id());
		System.out.println("FIRST_NAME: "+employeesDTO.getFirst_name());
		System.out.println("LAST_NAME: "+employeesDTO.getLast_name());
		System.out.println("EMAIL: "+employeesDTO.getEmail());
		System.out.println("PHONE_NUMBER: "+employeesDTO.getPhone_number());
		System.out.println("HIRE_DATE: "+employeesDTO.getHire_date());
		System.out.println("JOB_ID: "+employeesDTO.getJob_id());
		System.out.println("SALARY: "+employeesDTO.getSalary());
		System.out.println("COMMISSION_PCT: "+employeesDTO.getComission_pct());
		System.out.println("MANAGER_ID: "+employeesDTO.getManager_id());
		System.out.println("DEPARTMENT_ID: "+employeesDTO.getDepartment_id());
	}
	
	public void view(ArrayList<EmployeesDTO> ae) {
		for(EmployeesDTO employeesDTO: ae) {
			System.out.println("EMPLOYEE_ID: "+employeesDTO.getEmployee_id());
			System.out.println("FIRST_NAME: "+employeesDTO.getFirst_name());
			System.out.println("LAST_NAME: "+employeesDTO.getLast_name());
			System.out.println("EMAIL: "+employeesDTO.getEmail());
			System.out.println("PHONE_NUMBER: "+employeesDTO.getPhone_number());
			System.out.println("HIRE_DATE: "+employeesDTO.getHire_date());
			System.out.println("JOB_ID: "+employeesDTO.getJob_id());
			System.out.println("SALARY: "+employeesDTO.getSalary());
			System.out.println("COMMISSION_PCT: "+employeesDTO.getComission_pct());
			System.out.println("MANAGER_ID: "+employeesDTO.getManager_id());
			System.out.println("DEPARTMENT_ID: "+employeesDTO.getDepartment_id());
			System.out.println("====================================");
		}
	}

}
