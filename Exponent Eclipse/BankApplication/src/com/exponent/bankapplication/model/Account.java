package com.exponent.bankapplication.model;

public class Account {

	private int accountNo;
	private String accountName;
	private long aadharcardNo;
	private String pancardNo;
	private long mobailNo;
	private double accountBalance;

	// setter getter file

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAadharcardNo() {
		return aadharcardNo;
	}

	public void setAadharcardNo(long aadharcardno) {
		this.aadharcardNo = aadharcardno;
	}

	public String getPancardNo() {
		return pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	public long getMobailNo() {
		return mobailNo;
	}

	public void setMobailNo(long mobailNo) {
		this.mobailNo = mobailNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
// Encapsulation oops
