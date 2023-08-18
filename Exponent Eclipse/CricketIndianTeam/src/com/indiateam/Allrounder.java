package com.indiateam;

public class Allrounder extends India {
	
	public String aname = "HARDIK PANDAY";
	public String aname1 = " ASHIVEN ";
	public String aname2 = " AXER PATEL";
	
	@Override
	public void m1() {
		
		System.out.println("<<<<< ALL ROUNDER NAME  >>>>>");
	}
	public static void main(String[] args) {
		
		India l =new  Allrounder();
		l.player();
		l.caption();
		l.m1();
		
		Allrounder a = new Allrounder();

		System.out.println(a.aname);
		System.out.println(a.aname1);
		System.out.println(a.aname2);

		l.player();
		l.caption();
		l.m1();
		
	}

}
