package com.has.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	int sid;
	String sname;
	
	Address address; // entity reference
	
	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;

		
	}
	
}
//HAS-A serialization & DEserilization 
// entity reference
// Aggregation & composition