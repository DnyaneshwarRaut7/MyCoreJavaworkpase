package com.KeySetMapMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMap {

	public  Map<String,Map<String, String>> addCountryDetails() {

		Map<String, String> maharashtra = new HashMap<String, String>();

		maharashtra.put("PUNE", "pcme");
		maharashtra.put("MUMBAI", "thane");
		maharashtra.put("NAGER", "jamkhed");

		Map<String, String> gujrat = new HashMap<String, String>();

		gujrat.put("VAPI", "vvv");
		gujrat.put("SURAT", "sss");
		gujrat.put("AHAMADHPUR", "aaa");

		Map<String,Map<String, String> >india = new HashMap<String,Map<String, String>>();

		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJRAT", gujrat);

		return india;
	}

	public static void main(String[] args) {

		CountryMap country1 = new CountryMap();

		Map<String, Map<String, String>> mcountry = country1.addCountryDetails();

		Set<String> setofcountry =  mcountry.keySet();
		
		System.out.println("------- using iterator -----------");

		Iterator<String> itr = setofcountry .iterator();

		while (itr.hasNext()) {

			String country = itr.next();

			System.out.println(country);
			
			Map<String, String> setofstate =mcountry.get(country);
			Set<String> setofcity=setofstate.keySet();
			Iterator<String> itr2	=setofcity.iterator();
			while (itr2.hasNext()) {
			String city	=itr2.next();
			System.out.println(city+"     "+setofstate.get(city));
				
		}
			System.out.println("---------------------------");

		}
		
		for (String country : setofcountry) {
			
			System.out.println(country);
			
			 Map<String, String> statelist =	mcountry.get(country);
			 
			Set<String>state = statelist.keySet();
			
			for (String city : state) {
				
				System.out.println(statelist);
				
				System.out.println(statelist.get(statelist));
				
			}
			
		}
	}

}
