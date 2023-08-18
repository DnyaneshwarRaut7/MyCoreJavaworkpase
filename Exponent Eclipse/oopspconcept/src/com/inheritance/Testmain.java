package com.inheritance;

public class Testmain {

	public static void main(String[] args) {
		System.out.println("===main method started===");
		
		Developer dev  = new Developer();
		int totalsalary = dev.basesalary + dev.bonus;
		System.out.println(dev.basesalary);
        System.out.println(dev.bonus);
        System.out.println("Total salary of Developer is ;"+totalsalary);
        dev.m1("Devloper");
        System.out.println("===main method complited===");
	}

}
