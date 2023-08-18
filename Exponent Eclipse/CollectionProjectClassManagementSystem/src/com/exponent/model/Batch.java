package com.exponent.model;

public class Batch {

	private int bid;

	private String bname;

	private Facult f;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Facult getF() {
		return f;
	}

	public void setF(Facult f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", f=" + f + "]";
	}

	
	

}
