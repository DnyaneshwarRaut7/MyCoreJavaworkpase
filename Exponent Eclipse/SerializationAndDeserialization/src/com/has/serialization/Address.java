package com.has.serialization;

import java.io.Serializable;

public class Address implements Serializable{

	String LocalAddress;
	String PerAddress;
	long pincode;

	public Address(String localAddress, String perAddress, long pincode) {

		LocalAddress = localAddress;
		PerAddress = perAddress;
		this.pincode = pincode;
	}

}
//HAS-A serialization & DEserilization 
//entity reference
//Aggregation & composition