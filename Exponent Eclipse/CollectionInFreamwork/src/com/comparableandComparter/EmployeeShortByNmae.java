package com.comparableandComparter;

import java.util.Comparator;

public class EmployeeShortByNmae implements Comparator<Employee1> {

	
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return o1.ename.compareTo(o2.ename);
	}

}
