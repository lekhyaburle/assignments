package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	public Employee getEmployeeDetails(Employee employee);
	public Employee findInsuranceScheme(Employee employee);
	public void display(Employee employee);
}
