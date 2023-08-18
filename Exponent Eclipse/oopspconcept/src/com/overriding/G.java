package com.overriding;

public class G {
	
    private void m1()// private accessmodifier within a same class
	{
		
		System.out.println("=== private method ====");
	}
    
    final void m2() { // final keyword can not be override
    	
    	System.out.println("==final method");
    }
    
    public static void m3() { // static keyword
    	System.out.println(" == parent static method=== ");
    	
    	
    }

}

//pollymorphism in overriding same method not override private , static final method