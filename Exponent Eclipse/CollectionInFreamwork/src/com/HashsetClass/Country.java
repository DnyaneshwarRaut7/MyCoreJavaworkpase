package com.HashsetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Country {

// Duplicate value not alive
//Insertion order not mention
//Only one null values
//index order not mention

	public Set<Set<String>> addaCountry() {

		Set<String> maharashtra = new HashSet<String>();

		maharashtra.add("mumbai");
		maharashtra.add("pune");
		maharashtra.add("Nashik");
		maharashtra.add("A.nager");

		Set<String> gujrat = new HashSet<String>();

		gujrat.add("Surat");
		gujrat.add("vapi");
		gujrat.add("Ghandinager");
		gujrat.add("Ahamdabad");

		Set<Set<String>> india = new HashSet<Set<String>>();

		india.add(maharashtra);
		india.add(gujrat);

		return india;
	}

	public static void main(String[] args) {

		Country country = new Country();
		Set<Set<String>> india = country.addaCountry();
		
		System.out.println("---- itreater method-------------");

		Iterator<Set<String>> itr = india.iterator();
		while (itr.hasNext()) {

			Set<String> statelist = itr.next();
			System.out.println(statelist);

			Iterator<String> itr1 = statelist.iterator();

			while (itr1.hasNext()) {

				String cities = itr1.next();
				System.out.println(cities);

			}
			System.out.println("----------------------------------------");
		}
		System.out.println("------ for each loop -------");

		for (Set<String> statelist : india) {
			for (String cities : statelist) {
				System.out.println(cities);

			}

		}

	}

}
