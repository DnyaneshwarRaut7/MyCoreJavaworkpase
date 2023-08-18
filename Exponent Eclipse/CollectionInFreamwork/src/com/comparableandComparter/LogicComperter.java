package com.comparableandComparter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicComperter {

	public static void main(String[] args) {

		Employee1 e = new Employee1(11, "mauli", 1234);
		Employee1 e1 = new Employee1(67, "suraj", 4735);
		Employee1 e2 = new Employee1(10, "rushi", 38374);
		Employee1 e3 = new Employee1(99, "ritesh", 3687);
		Employee1 e4 = new Employee1(66, "tushar", 372646);

		List<Employee1> employeelist = new ArrayList<Employee1>();

		employeelist.add(e);
		employeelist.add(e1);
		employeelist.add(e2);
		employeelist.add(e3);
		employeelist.add(e4);

		System.out.println("------- before sorting --------");

		for (Employee1 emp : employeelist) {

			System.out.println(emp.eid + " " + "  " + emp.ename + "  " + emp.salary);

		}
		System.out.println(" Employee soring by eid");

		Collections.sort(employeelist, new EmployeeShortById());

		for (Employee1 emp : employeelist) {

			System.out.println(emp.eid + " " + "  " + emp.ename + "  " + emp.salary);

		}
		
	
		System.out.println("----- Employee sorting by enmae -----");
		Collections.sort(employeelist, new EmployeeShortByNmae());
		
		for (Employee1 emp : employeelist) {

			System.out.println(emp.eid + " " + "  " + emp.ename + "  " + emp.salary);

		
		
	}
}
}