package com.list;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List al = new ArrayList(); // list = interface , ArrayList = class , LOsscopling object / indirectobject

		al.add(10);// 0 index add value
		al.add(20);// 1
		al.add(40);// 2
		al.add(40);// 3
		al.add("mauli");// 4
		al.add(null);// 5
		al.add(null);// 6
		al.add(12.12);
		al.add('a');

		System.out.println(al); // index print

		System.out.println("size of index :" + al.size()); // size print

		System.out.println("index elements return:" + al.get(4));// elements return
		System.out.println("return:" + al.get(6));

		System.out.println(al.get(0));

		// System.out.println(al.get(8)); // index out of bondexception

		System.out.println(al.get(2));

		System.out.println(al.isEmpty());// falase // index no empty

		System.out.println(al.contains(50));// false canton check

		System.out.println(al.contains(10));// true

		System.out.println(al.contains(al.remove(0)));// index remove

		System.out.println(al);// index print
	}

}
//list interface, array list class example hattrogeans
