package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> al2 = new ArrayList<String>();

		al2.add("mauli");
		al2.add("sumit");
		al2.add("tushar");
		al2.add("sandip");
		al2.add("suraj");

		System.out.println(al2);

		System.out.println("size of leanth:" + al2.size());

		System.out.println(al2.get(4));

		System.out.println("----- using itreter interface ----------");

		Iterator<String> itr = al2.iterator();

		while (itr.hasNext()) {

			String s = itr.next();

			System.out.println(s);
		}

		System.out.println("----- for each loop -------");

		for (String s : al2) {

			System.out.println(s);

		}

		System.out.println("------ Integer geanary ------- ");

		List<Integer> al3 = new ArrayList<Integer>();

		al3.add(11);
		al3.add(22);
		al3.add(33);
		al3.add(44);
		al3.add(55);

		System.out.println(al3);
		System.out.println("Size of leanth:" + al3.size());

		System.out.println(al3.get(3));

		System.out.println("----- using itereter interface-----");
		Iterator<Integer> itr2 = al3.iterator();

		while (itr2.hasNext()) {

			int i = itr2.next();

			System.out.println(i);

		}

		System.out.println("----- for each loop -------");

		for (Integer i : al3) {

			System.out.println(i);
		}

	}

}
