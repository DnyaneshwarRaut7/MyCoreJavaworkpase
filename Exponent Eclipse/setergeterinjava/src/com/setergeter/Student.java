package com.setergeter;

public class Student {
	// *****
	public String name;

	// private
	private String sname;
	private String address;
	private long mno;
	private String cname;
	private int sid;
	public char div;
	private float per;

	public void setName(String name) { // set method

		this.name = name;
	}

	public String getName() { // get method
		return name;
	}

	public void setAddress(String address) {
		this.address = address;

	}

	public String getAddress() {
		return address;
	}

	public void setMno(long mon) {
		this.mno = mno;
	}

	public long getMno() {
		return mno;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public int getId() {
		return sid;
	}

	public void setDiv(char div) {
		this.div = div;
	}

	public char getDiv() {
		return div;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public float getPer() {
		return per;
	}

	public static void main(String[] args) {

	}

}
