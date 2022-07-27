package com.iu.employees;

public class EmployeesView {
	
	public void view(EmployeesDTO employeesDTO) {
		System.out.println(employeesDTO.getEmployee_id());
		System.out.println(employeesDTO.getFirst_name());
		System.out.println(employeesDTO.getLast_name());
		System.out.println(employeesDTO.getEmail());
		System.out.println(employeesDTO.getPhone_number());
		System.out.println(employeesDTO.getHire_date());
		System.out.println(employeesDTO.getJob_id());
		System.out.println(employeesDTO.getSalary());
		System.out.println(employeesDTO.getComission_pct());
		System.out.println(employeesDTO.getManager_id());
		System.out.println(employeesDTO.getDepartment_id());
	}

}
