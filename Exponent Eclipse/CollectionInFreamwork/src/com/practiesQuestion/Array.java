package com.practiesQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {

	// 1. How do you convert an ArrayList to Array

	public static void main(String[] args) {

		System.out.println("Q1. How do you convert an ArrayList to Array");

		List<Integer> array = new ArrayList<Integer>();

		array.add(11);
		array.add(22);
		array.add(33);
		array.add(44);
		array.add(55);
		array.add(66);
		array.add(77);

		Object[] obj = array.toArray();// to array method

		for (Object ob : obj) {// for each loop

			System.out.println("Array list:  " + ob + "   ");

		}

		System.out.println("---------------------------------");

		List<Integer> array2 = new ArrayList<Integer>();

		array2.add(10);
		array2.add(20);
		array2.add(30);
		array2.add(40);
		array2.add(50);

		Integer[] arr = new Integer[array2.size()];

		arr = array2.toArray(arr);
		for (Integer a : arr) {

			System.out.println(a);

		}

		System.out.println("Q2.retrive an elements from perticular position----");

		List<String> list = new ArrayList<String>();
		list.add("mauli");// o
		list.add("sumit");// 1
		list.add("tushar");// 2
		list.add("Suraj");// 3
		list.add("sandip");// 4

		System.out.println(list);

		System.out.println("=================================");
		String elements = list.get(1);// list print
		System.out.println("retrive first elements : " + elements);

		String elements1 = list.get(3);// index our of bond exception

		System.out.println("retrive 3 elements : " + elements1);

		System.out.println("Q3 get the position partucular element..........................");

		List<String> fruts = new ArrayList<String>();
		fruts.add("mango");// 0
		fruts.add("Apple");// 1
		fruts.add("otange");// 2
		fruts.add("guava");// 3
		fruts.add("peach");// 4
		System.out.println(fruts);
		System.out.println(fruts.indexOf("Apple"));// Position print
		
		System.out.println("Q4 elements is present-----------------");
		
		List<String> countrys = new ArrayList<String>();
		countrys.add("india");// 0
		countrys.add("amerika");// 1
		countrys.add("usa");// 2
		countrys.add("china");// 3
		countrys.add("south");// 4
		System.out.println(countrys);
		System.out.println(countrys.contains(20));//false
		System.out.println(countrys.contains("india"));// true 
		
		System.out.println("Q5 Empty or not-----------------------------");
		List<String> state = new ArrayList<String>();
		state.add("mh");// 0
		state.add("gujrat");// 1
		state.add("delhi");// 2
		state.add("gova");// 3
		state.add(null);// 4
		System.out.println(state);
		System.out.println(state.isEmpty());// false list is present
		
		System.out.println("Q 6 remove all elements........**************************");
		
		List<Float> value = new ArrayList<Float>();
		value.add(null);//0
		value.add(11.11f);
		
		value.add(22.22f);
		value.add(33.33f);
		value.add(44.44f);
		System.out.println(value);
		System.out.println(value.remove(0));// remove
		System.out.println(value.remove(3));
		System.out.println(value);
		System.out.println(value.removeAll(value));//true
		System.out.println(value);//space
		
		System.out.println("7...........................");
		List a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add("mauli");
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.remove(1));
		System.out.println(a1);
		
		System.out.println("8********************************");
		List a2 = new ArrayList();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add("mauli");
		a2.add(null);
		System.out.println(a2);
		Collections.reverse(a2);
		System.out.println(a2);
		System.out.println("9**********************************");
		
		List<String> state1 = new ArrayList<String>();
		state1.add("mh");// 0
		state1.add("gujrat");// 1
		state1.add("delhi");// 2
		state1.add("gova");// 3
		state1.add(null);// 4
		System.out.println(state1);
		
		//Collections.sort(state1,Collection.reverseOrder());
		System.out.println(state1);
	}

}
