package com.indiateam;

public class Batsman extends India {
	
	public String bname = "VIRAT KOHLI";
	public String bname1 = "K.L.RAHUL ";
	public String bname2 = "SURAY KUMAR ";
	public String bname3 = " RISHB PANTH";
	@Override
	public void m1() {
	System.out.println("=== Batsman name === ");
	}
	
public static void main(String[] args) {
	
	
	India i = new Batsman();
	i.player();
	i.caption();
	i.m1();
	
	Batsman b = new Batsman();
	System.out.println(b.bname);
	System.out.println(b.bname1);
	System.out.println(b.bname2);
	System.out.println(b.bname3);
	
	b.player();
	b.caption();
	b.m1();
	
}
}