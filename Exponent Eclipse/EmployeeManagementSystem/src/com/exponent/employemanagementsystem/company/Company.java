package com.exponent.employemanagementsystem.company;

import com.exponent.employeemanagementsystem.model.Employee;
import com.exponent.employemanagementsystem.serviceimpl.department.Department;

public class Company {

	public Employee e1 = new Employee();
	public Employee e2 = new Employee();
	public Employee e3 = new Employee();
	public Employee e4 = new Employee();
	public Employee e5 = new Employee();
	
	
	public static void main(String[] args) {
		
		Department dept = new Department();
	   
	     Employee e = dept.addEmployeeDetails();
     	System.out.println(e.Eid+" "+e.Ename+" "+e.Eaddress);
     	
     	System.out.println("******************");
     	
     	Company c = dept.addAllEmployeeDetails();
     	System.out.println(c.e1.Eid+" "+c.e1.Ename+" "+c.e1.Eaddress);
     	System.out.println(c.e2.Eid+" "+c.e2.Ename+" "+c.e2.Eaddress);
     	System.out.println(c.e3.Eid+" "+c.e3.Ename+" "+c.e3.Eaddress);
     	System.out.println(c.e4.Eid+" "+c.e4.Ename+" "+c.e4.Eaddress);
     	System.out.println(c.e5.Eid+" "+c.e5.Ename+" "+c.e5.Eaddress);
     	
		
	}

}
