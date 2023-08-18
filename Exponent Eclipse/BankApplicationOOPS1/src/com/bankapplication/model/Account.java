package com.bankapplication.model;

public class Account {

	private int accno;

	private String accname;
	private long adharno;
	private long mobailno;
	private String panno;
	private float accbalance;

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getAccno() {

		return accno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public long getAdharno() {
		return adharno;
	}

	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}

	public long getMobailno() {
		return mobailno;
	}

	public void setMobailno(long mobailno) {
		this.mobailno = mobailno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public float getAccbalance() {
		return accbalance;
	}

	public void setAccbalance(float accbalance) {
		this.accbalance = accbalance;
	}

}
