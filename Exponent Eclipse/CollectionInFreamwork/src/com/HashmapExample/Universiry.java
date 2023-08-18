package com.HashmapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Universiry {

	public Map<String, List<String>> addUniversitydetails() {

		List<String> shavajiuniversity = new ArrayList<String>();

		shavajiuniversity.add("Enginearing");
		shavajiuniversity.add("Famacy");
		shavajiuniversity.add("Ariciteacture");

		List<String> puneuniversity = new ArrayList<String>();

		puneuniversity.add("B.com");
		puneuniversity.add("BSC");
		puneuniversity.add("BCA");

		List<String> mumbaiuniversity = new ArrayList<String>();

		mumbaiuniversity.add("DEPLOMA");
		mumbaiuniversity.add("pent Technology");
		mumbaiuniversity.add("Petrochemical");

		// <List<String>> maharashtrauniversity = new ArrayList<List<String>>();
		Map<String, List<String>> maharashtrauniversity = new HashMap<String, List<String>>();

		maharashtrauniversity.put("SHAVAJIUNIVERSITY", shavajiuniversity);
		maharashtrauniversity.put("PUNEUNIVERSITY", puneuniversity);
		maharashtrauniversity.put("MUMBAIUNIVERSITY", mumbaiuniversity);

		return maharashtrauniversity;

	}

	public static void main(String[] args) {

		Universiry university = new Universiry();
		Map<String, List<String>> alluniversity = university.addUniversitydetails();

		Set<String> key = alluniversity.keySet();

		System.out.println(key);

		System.out.println("--------- using iterato interface -----------");

		Iterator<String> itr = key.iterator();

		while (itr.hasNext()) {

			String universirylist = itr.next();

			System.out.println(universirylist);

			List<String> uni = alluniversity.get(universirylist);

			// System.out.println(uni);

			Iterator<String> itr1 = uni.iterator();

			while (itr1.hasNext()) {

				String collage = itr1.next();

				System.out.println(collage);

			}
			
			System.out.println("--------------------------------");

		}
		
		System.out.println("============using for each loop =========");
		
		for (String universirylsty1 : key) {
			
			System.out.println(universirylsty1);
			
		List<String> college  =	alluniversity.get(universirylsty1);
			
			
			for (String collegelist : college) {
				
			System.out.println(collegelist);
			}
			
		}

	}

}
