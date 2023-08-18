package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {

	public List<List<String>> addaCountry() {

		List<String> maharashtra = new ArrayList<String>();

		maharashtra.add("mumbai");
		maharashtra.add("pune");
		maharashtra.add("Nashik");
		maharashtra.add("A.nager");

		List<String> gujrat = new ArrayList<String>();

		gujrat.add("Surat");
		gujrat.add("vapi");
		gujrat.add("Ghandinager");
		gujrat.add("Ahamdabad");

		List<List<String>> india = new ArrayList<List<String>>();

		india.add(maharashtra);
		india.add(gujrat);

		return india;
	}

	public static void main(String[] args) {

		Country country = new Country();
		List<List<String>> india = country.addaCountry();

		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {

			List<String> statelist = itr.next();
			System.out.println(statelist);

			Iterator<String> itr1 = statelist.iterator();

			while (itr1.hasNext()) {

				String cities = itr1.next();
				System.out.println(cities);

			}
			System.out.println("----------------------------------------");
		}
		System.out.println("------ for each loop -------");

		for (List<String> statelist : india) {
			for (String cities : statelist) {
				System.out.println(cities);

			}

		}

	}

}
