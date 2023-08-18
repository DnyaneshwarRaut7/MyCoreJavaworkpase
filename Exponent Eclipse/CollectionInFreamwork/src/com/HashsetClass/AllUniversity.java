package com.HashsetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllUniversity {

	// Duplicate value not alive
	// Insertion order not mention
	// Only one null values
	// index order not mention

	public Set<Set<String>> addUniversity() {

		Set<String> shavajiuniversity = new HashSet<String>();

		shavajiuniversity.add("Enginearing");
		shavajiuniversity.add("Famacy");
		shavajiuniversity.add("Ariciteacture");

		Set<String> puneuniversity = new HashSet<String>();

		puneuniversity.add("B.com");
		puneuniversity.add("BSC");
		puneuniversity.add("BCA");

		Set<String> mumbaiuniversity = new HashSet<String>();

		mumbaiuniversity.add("DEPLOMA");
		mumbaiuniversity.add("pent Technology");
		mumbaiuniversity.add("Petrochemical");

		Set<Set<String>> maharashtrauniversity = new HashSet<Set<String>>();

		maharashtrauniversity.add(shavajiuniversity);
		maharashtrauniversity.add(puneuniversity);
		maharashtrauniversity.add(mumbaiuniversity);

		return maharashtrauniversity;

	}

	public static void main(String[] args) {

		AllUniversity university = new AllUniversity();
		Set<Set<String>> alluniversity = university.addUniversity();

		Iterator<Set<String>> itr = alluniversity.iterator();

		while (itr.hasNext()) {

			Set<String> universitylist = itr.next();
			System.out.println(universitylist);

			Iterator<String> itr1 = universitylist.iterator();

			while (itr1.hasNext()) {

				String cource = itr1.next();
				System.out.println(cource);
			}
			System.out.println("----------------------------------------------");
		}
		System.out.println("==== for each loop ====");

		for (Set<String> universitylist : alluniversity) {

			// System.out.println(alluniversity);

			for (String course : universitylist) {
				System.out.println(course);
			}

		}

	}

}
