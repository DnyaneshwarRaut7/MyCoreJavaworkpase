package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllUniversity {

	public List<List<String>> addUniversity() {

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

		List<List<String>> maharashtrauniversity = new ArrayList<List<String>>();

		maharashtrauniversity.add(shavajiuniversity);
		maharashtrauniversity.add(puneuniversity);
		maharashtrauniversity.add(mumbaiuniversity);

		return maharashtrauniversity;
		
	}
	public static void main(String[] args) {
		
		AllUniversity university = new AllUniversity();
		List<List<String>>alluniversity = university.addUniversity();
		

		Iterator<List<String>>itr =	alluniversity.iterator();
		
		while(itr.hasNext()) {
			
			List<String>universitylist = itr.next();
			System.out.println(universitylist);
			
			Iterator <String> itr1=universitylist.iterator();
			
			while(itr1.hasNext()) {
				
				String cource= itr1.next();
				System.out.println(cource);
			}
			System.out.println("----------------------------------------------");
		}
		System.out.println("==== for each loop ====");
		
		for(List<String>universitylist:alluniversity) {
			
			//System.out.println(alluniversity);
			
			for( String course:universitylist) {
				System.out.println(course);
			}
			
		}
		
		
	}
	

}
