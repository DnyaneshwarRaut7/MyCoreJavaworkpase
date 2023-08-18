package runnable;

import java.util.Iterator;

public class Mytread2 implements Runnable {

	// Implement method are runnable interface
	@Override
	public void run() {

		System.out.println("myThread 2 Started");
		System.out.println("MyThred 2 Name :-" + Thread.currentThread().getName());

		displayTable(6);
	}
	public void displayTable(int a) {
		
		for(int i=1;i<=10;i++ ) {
			System.out.println(i*a);
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		System.out.println("Main Thread Name:-" + Thread.currentThread().getName());

		Mytread2 m2 = new Mytread2();
		Thread thread = new Thread(m2);

		thread.start();
		//m2.run();
	}

}
