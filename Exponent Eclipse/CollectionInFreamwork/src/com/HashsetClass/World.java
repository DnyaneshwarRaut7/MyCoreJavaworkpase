package com.HashsetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class World {
	
	
// Duplicate value not alive
//Insertion order not mention
//Only one null values
//index order not mention


	public Set<Set<Set<String>>> addCountries() {

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

		Set<String> colombo = new HashSet<String>();

		colombo.add("Thimbirigasya ya");
		colombo.add("Dehieala");
		colombo.add("Moratuwa");
		colombo.add("city 1");

		Set<String> gallo = new HashSet<String>();

		gallo.add("SNew York");
		gallo.add("Chicago");
		gallo.add("Lose Angelese");
		gallo.add("San Diego");

		Set<Set<String>> shrilanka = new HashSet<Set<String>>();

		shrilanka.add(colombo);
		shrilanka.add(gallo);

		Set<Set<Set<String>>> World = new HashSet<Set<Set<String>>>();

		World.add(india);
		World.add(shrilanka);

		return World;
	}

	public static void main(String[] args) {

		World world = new World();
		Set<Set<Set<String>>> World = world.addCountries();

		Iterator<Set<Set<String>>> itr = World.iterator();

		while (itr.hasNext()) {

			Set<Set<String>> Countrtlist = itr.next();
			System.out.println(Countrtlist);

			Iterator<Set<String>> itr1 = Countrtlist.iterator();

			while (itr1.hasNext()) {

				Set<String> ststelist = itr1.next();
				System.out.println(ststelist);

				Iterator<String> itr2 = ststelist.iterator();

				while (itr2.hasNext()) {
					String citieslist = itr2.next();
					System.out.println(citieslist);

				}
				System.out.println("----------------------------------");

			}
			System.out.println("-----------------------------");

		}
		System.out.println("===== for each loop ======");

		for (Set<Set<String>> Countrylist : World) {

			for (Set<String> statelist : Countrylist) {

				for (String cities : statelist) {

					System.out.println(cities);

				}

			}
		}

	}

}


