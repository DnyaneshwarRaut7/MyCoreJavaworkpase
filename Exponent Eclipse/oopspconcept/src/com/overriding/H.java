package com.overriding;

public class H extends G {

	public static void m3() { // static keyword 
		System.out.println(" == static method child clad=== ");

	}

	public static void main(String[] args) {
		
		G.m3();// parent static method call
	    H.m3();	
	    
	    System.out.println("==== parent child mixed object");
	    
	    G g = new H();// parent child mixed object
	    g.m3();
	    
		System.out.println("==== child class object");
       H h = new H(); // child class object
       h.m3();
       
       
	}
}

//pollymorphism in overriding same method not override private , static final method