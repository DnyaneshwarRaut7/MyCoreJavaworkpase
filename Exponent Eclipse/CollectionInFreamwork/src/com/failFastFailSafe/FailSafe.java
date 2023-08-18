package com.failFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafe {

	public static void main(String[] args) {
		
		System.out.println("List FailSafe........");
		
		//CopyOnWriteArrayList<E>
		//CopyOnWriteArraySet<E>
		//ConcurrentHashMap<K, V>
		
		CopyOnWriteArrayList<Integer> a1 = new CopyOnWriteArrayList<Integer>();
		
		
		
		a1.add(11);
	    a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		
		
	Iterator<Integer> itr =	a1.iterator();
	
	while(itr.hasNext()) {
		
		a1.add(9999);
		
		
	int i=	itr.next();
	
	System.out.println(i);
	
	System.out.println(a1);
	}
	
	System.out.println("Set FailSafe........");
	
	
	CopyOnWriteArraySet<Integer> s1 =  new CopyOnWriteArraySet<Integer>();
	
	s1.add(10);
	s1.add(20);
	s1.add(33);
	s1.add(10);
	
	Iterator<Integer> itr2 =	s1.iterator();
	
	while(itr2.hasNext()) {
		
		s1.add(777);
		
	int s =	itr2.next();
	
	System.out.println(s);
	
	System.out.println(s1);
		
		
	}

	}

}
