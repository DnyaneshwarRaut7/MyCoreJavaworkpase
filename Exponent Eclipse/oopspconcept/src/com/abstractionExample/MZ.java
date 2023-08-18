package com.abstractionExample;

public class MZ extends vehicle {

	@Override
	public void specification() {

		System.out.println("=== MZ specification =====");
	}

	public static void main(String[] args) {
		
		System.out.println("----- parent child mix class----");


		vehicle v1 = new TATA();  // parent + child mix object
                                  // losecoupling method
		v1.tyre();
		v1.Tering();
		v1.specification();
		//v1.m4();
		

		System.out.println(" ------ child class-----  ");

		TATA mz = new TATA(); // child class object
		mz.tyre();          // titecoupling object
		mz.Tering();
		mz.specification();
        mz.m4();
	}

}
//abstraction of abstract class in abstract override method losecouping & tite coupling