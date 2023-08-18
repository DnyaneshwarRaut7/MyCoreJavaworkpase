package com.serialization;

import java.io.Serializable;

public class Emoloyee implements Serializable {
	
	int empid;
	String empname;
	String empaddress;
	
	

	public Emoloyee(int empid, String empname, String empaddress) {  // Parameterize counstter
		
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}


}
//serialization & deseralization example   