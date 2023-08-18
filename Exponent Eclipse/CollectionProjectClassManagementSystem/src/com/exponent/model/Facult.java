package com.exponent.model;

public class Facult {
	
	private int fid;
	
	private String fname;
	
	private Course c; //entity reference

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Facult [fid=" + fid + ", fname=" + fname + ", c=" + c + "]";
	}

	
}
