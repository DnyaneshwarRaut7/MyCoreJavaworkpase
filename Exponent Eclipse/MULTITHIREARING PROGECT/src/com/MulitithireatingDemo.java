package com;

public class MulitithireatingDemo {

	public static void main(String[] args) {

		System.out.println("Single Thread Application Srtrted Successfully .... ");

		// Thread is a class preset in a java .lang package
		// currentThread method is refers a current thread method
		// getname method is thread Class imitated refer current class method

		System.out.println("name :" + Thread.currentThread().getName());
		// by default main priority 5
		System.out.println("Priority :" + Thread.currentThread().getPriority());
		// custom maximum size is thread 10
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		// refer current class method
		System.out.println("priority :" + Thread.currentThread().getPriority());
		// thread is present always return True
		// thread is not present return false
		System.out.println("isAlive : " + Thread.currentThread().isAlive());
	}

}
