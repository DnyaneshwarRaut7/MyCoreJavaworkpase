package com.failFastFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Failfast {

	public static void main(String[] args) {
		
		
		List<Integer> a1 = new ArrayList<Integer>();
		
		
		a1.add(11);
	    a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		
		
	Iterator<Integer> itr =	a1.iterator();
	
	while(itr.hasNext()) {
		
		a1.add(9999);// exception concurrent modification exception
		
		
	int i=	itr.next();
	
	System.out.println(i);
	}
		
	}

}
