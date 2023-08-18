package com.HashmapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.list.main;

public class Country {

	public Map<String, List<String>> addCountryDetails() {

		List<String> maharashtra = new ArrayList<String>();

		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nager");

		List<String> gujrat = new ArrayList<String>();

		gujrat.add("Surat");
		gujrat.add("vapi");
		gujrat.add("Badodha");

		Map<String, List<String>> india = new HashMap<String, List<String>>();

		india.put("MAHARASHTRA", maharashtra);
		india.put("Gujrat", gujrat);

		return india;

	}

	public static void main(String[] args) {

		Country c = new Country();
		Map<String, List<String>> india = c.addCountryDetails();

		Set<String> key = india.keySet();

		System.out.println("--------- using iterato interface -----------");

		Iterator<String> itr = key.iterator();

		while (itr.hasNext()) {

			String kk = itr.next();

			System.out.println(kk);
			List<String> statelist = india.get(kk);

			System.out.println(statelist);

			Iterator<String> itr2 = statelist.iterator();

			while (itr2.hasNext()) {

				System.out.println(itr2.next());
			}

		}

		System.out.println(" ======= using for esch loop =======");

		for (String cc : key) {

			System.out.println(cc);

			List<String> cities = india.get(cc);

			for (String string : cities) {
				System.out.println(string);

			}

		}

	}

}

//}
