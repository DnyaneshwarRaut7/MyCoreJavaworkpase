package com.Aggregarionexample;

public class Address {

	String LocalAddress;
	String PerAddress;
	long pincode;


	public Address(String localAddress, String perAddress, long pincode) {

		LocalAddress = localAddress;
		PerAddress = perAddress;
		this.pincode = pincode;
	}

}
//Aggregation of Entity reference  