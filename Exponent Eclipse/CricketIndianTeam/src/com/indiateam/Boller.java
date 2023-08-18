package com.indiateam;

public class Boller extends India {
   

	public String bname = "BHUVNESHWAR KUMAR";
	public String bname1 = " MOHAMD SHAMI";
	public String bname2 = " ARSEDIP";
	
	
	@Override
	public void m1() {
		
		System.out.println("<<<< BOLAR NAME >>>>");
	}
	
	public static void main(String[] args) {
		
		
		India india = new Boller();
		
		india.player();
		india.caption();
		india.m1();
		
		Boller b = new Boller();
		
		System.out.println(b.bname);
		System.out.println(b.bname1);
		System.out.println(b.bname2);

		b.player();
		b.caption();
		b.m1();
	}


}
