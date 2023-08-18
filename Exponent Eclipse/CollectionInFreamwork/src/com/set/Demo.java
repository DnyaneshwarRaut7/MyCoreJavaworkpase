package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(11);
		set.add(22);
		set.add(33);
		set.add(null);
		set.add(null);
		set.add(44);
		set.add(33);
		set.add(22);

		System.out.println(set);
		System.out.println(set.size());// size method
		System.out.println(set.isEmpty());// no empty false
		System.out.println(set.contains(67));// false
		System.out.println(set.contains(22));// true
		// System.out.println(set.containsAll(null));// null pointer exception
		System.out.println(set.remove(2));// index not alcove false
		System.out.println(set.remove(33));// elements present // true
		// System.out.println(set.removeAll(set));// true
		System.out.println(set);// []

		System.out.println("-------------- interate method -----------------------");
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {

			Integer i = itr.next();

			System.out.println(i);
		}
		System.out.println("------------------ for each loop ---------------");

		for (Integer i : set) {

			System.out.println(i);
		}

	}

}
// only unic  elements
// not allow duplicate
//only one null value
//Random access of elements is not possible