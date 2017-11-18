package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class ServiceMain {

	public static void main(String[] args) {
			Employee employee=new Employee();
		   Service services=new Service();
		  employee= services.getEmployeeDetails(employee);
		  employee= services.findInsuranceScheme(employee);
		services.display(employee);
			
			}
			
	
	}
		
		
	


