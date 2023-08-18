package com.exponent.employemanagementsystem.serviceimpl.department;

import com.exponent.employeemanagementsystem.model.Employee;
import com.exponent.employemanagementsystem.company.Company;

public class Department {
      


	public Employee addEmployeeDetails(){
		
		
		Employee e = new Employee();
        e.Eid = 1;
		e.Ename = "DNYANESHWAR";
		e.Eaddress = "PUNE";
		
		return e;
	}
	
	
	
		public Company  addAllEmployeeDetails() {
		
		Company c = new Company();
		
		c.e1.Eid = 100;
		c.e1.Ename = "SUMIT";
		c.e1.Eaddress = "nager";
		
		c.e2.Eid = 101;
		c.e2.Ename = "TUSHAR";
		c.e2.Eaddress = "Mumbai";
		
		c.e3.Eid = 102;
		c.e3.Ename = "Suraj";
		c.e3.Eaddress = "pune";
		
		c.e4.Eid = 100;
		c.e4.Ename = "om";
		c.e4.Eaddress = "jamkhed";
		
		c.e5.Eid = 100;
		c.e5.Ename = "avi";
		c.e5.Eaddress = "hadapsar";
		
		return c;
		
	}
		

}
