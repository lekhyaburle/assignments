package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Designation;
import com.cg.eis.bean.Employee;
import com.cg.eis.bean.InsuranceScheme;

public class Service extends Employee implements IEmployeeService {
	//Employee employee = new Employee();
	public Employee getEmployeeDetails(Employee employee)
	{
	Scanner scInput=new Scanner(System.in);
	System.out.println("Enter employee details");
	System.out.println("Enter Employee Id");
	employee.setId(scInput.nextInt());
	scInput.nextLine();
	System.out.println("Enter Employee Name");
	employee.setName(scInput.nextLine());
	System.out.println("Enter Salary");
	employee.setSalary(scInput.nextFloat());
	scInput.nextLine();
	scInput.close();
	return employee;
	}
	public Employee findInsuranceScheme(Employee employee)
	{
		if(employee.getSalary()>=5000 && employee.getSalary()<20000){
			employee.setDesignation(Designation.SystemAssociate);
			employee.setInsuranceScheme(InsuranceScheme.SchemeC);}
			else if(employee.getSalary()>=20000 && employee.getSalary()<40000 ){
				employee.setDesignation(Designation.Programmer);
				employee.setInsuranceScheme(InsuranceScheme.SchemeB);}
			else if(employee.getSalary()>=40000){
				employee.setDesignation(Designation.Manager);
				employee.setInsuranceScheme(InsuranceScheme.SchemeA);}
			else if(employee.getSalary()<5000)
			{
				employee.setDesignation(Designation.Clerk);
				employee.setInsuranceScheme(InsuranceScheme.NoScheme);}	
	return employee;
	}
	public void display(Employee employee){
	   System.out.println("Id:"+employee.getId()); 
	   System.out.println("Name:"+employee.getName());
    	 System.out.println("Salary:"+employee.getSalary());
    	 System.out.println("Designation:"+employee.getDesignation());
    	 System.out.println("Insurance Scheme:"+employee.getInsuranceScheme());
     }
}
