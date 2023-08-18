package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {

	public List<List<List<String>>> addCountries() {

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

		List<String> colombo = new ArrayList<String>();

		colombo.add("Thimbirigasya ya");
		colombo.add("Dehieala");
		colombo.add("Moratuwa");
		colombo.add("city 1");

		List<String> gallo = new ArrayList<String>();

		gallo.add("SNew York");
		gallo.add("Chicago");
		gallo.add("Lose Angelese");
		gallo.add("San Diego");

		List<List<String>> shrilanka = new ArrayList<List<String>>();

		shrilanka.add(colombo);
		shrilanka.add(gallo);

		List<List<List<String>>> World = new ArrayList<List<List<String>>>();

		World.add(india);
		World.add(shrilanka);

		return World;
	}

	public static void main(String[] args) {

		World world = new World();
		List<List<List<String>>> World = world.addCountries();

		Iterator<List<List<String>>> itr = World.iterator();

		while (itr.hasNext()) {

			List<List<String>> Countrtlist = itr.next();
			System.out.println(Countrtlist);

			Iterator<List<String>> itr1 = Countrtlist.iterator();

			while (itr1.hasNext()) {

				List<String> ststelist = itr1.next();
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

		for (List<List<String>> Countrylist : World) {

			for (List<String> statelist : Countrylist) {

				for (String cities : statelist) {

					System.out.println(cities);

				}

			}
		}

	}

}
