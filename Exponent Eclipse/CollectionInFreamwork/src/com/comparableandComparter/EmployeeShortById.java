package com.comparableandComparter;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {

		if (o1.eid > o2.eid) {

			return 1;

		} else if (o1.eid == o1.eid) {

			return 0;
		} else {

			return -1;
		}
	}

}
