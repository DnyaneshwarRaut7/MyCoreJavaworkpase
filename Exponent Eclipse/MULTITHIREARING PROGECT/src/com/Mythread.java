package com;

public class Mythread extends Thread {

	public void run() {

		try {
			Thread.currentThread().sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run Thread Name :-" + Thread.currentThread().getName());
		System.out.println("Run Method Started ");

	}

}
