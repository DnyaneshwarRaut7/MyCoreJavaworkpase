package com.Stringexample;

public class MainClass {

	private static final String[] arrayofstr = null;

	public static void main(String[] args) {

		System.out.println("===== spilt method =======");

		String str = "Hellow how are you";
        System.out.println(str);

		String[] strArray = str.split(" ");// space remove spilt karte
		for (String s : strArray) {
		System.out.println(s);
		}

		System.out.println("----------------------------------");

		String str2 = "A::E::I::O::U";
		System.out.println(str2);
		String[] strarray2 = str2.split("::");
        for (String s2 : strarray2) {
        System.out.println(s2);
		}

		System.out.println("====== index method ========");// char pass kela ki to number print karto
		String str3 = "Dnyaneshwar";
		System.out.println(str3);

		System.out.println(str3.length());

		int i = str3.indexOf('e');
		System.out.println("index :" + i);

		int l = str3.indexOf('p');
		System.out.println("index :" + l);

		System.out.println("============= intern method ========");

		String s5 = new String("mauli").intern();// litral object add 

		System.out.println(s5);

		System.out.println("================= format method ==============");

		String f = "TCS";// format concat addition hote
		String f2 = "IT Campany";

		String format = String.format("%s %s", f,f2);
		System.out.println(format);

		System.out.println("==== spilt with double parameter ======");

		String s7 = "I am fine";
		System.out.println(s7);

		String[] strArray7 = s7.split(" ", 2);// 2 type spilt

		for (String ss : strArray7) {

			System.out.println(ss);
		}

		System.out.println("========= substring method =======");

		String s8 = "javaprograming";// number pass kel pudch print hot
		// System.out.println(s8);

		s8 = s8.substring(4);
		s8 = s8.substring(3, 10);
		System.out.println(s8);

		System.out.println("======= subsequence method =======");

		String s9 = "Student";
		// System.out.println(s9);
		System.out.println(s9.subSequence(3, 7));// two number middle letter
		// System.out.println(s9);

		System.out.println("===== replace char method =====");
		String s10 = "Hi welcome to java";
		System.out.println(s10);
		String vv = s10.replace('a', 'o');// char replace hot
		System.out.println(vv);

		System.out.println("====== replase word ========== ");

		String v2 = s10.replace("java", "Eclipse");// word replace hoto 
		System.out.println(v2);

		System.out.println("=== replace all method ======");

		String s11 = "Dnyanehwar Raut";
		System.out.println(s11);

		String rr1 = s11.replaceAll("Raut", "mauli");// word replace hoto

		System.out.println(rr1);

		System.out.println("======= valu of method ====");

		int b = 44;
		String v = String.valueOf(b + 2);
		System.out.println(v);

		String vv2 = String.valueOf('c' + "har" + 30);// int ,doubal char convert String
		System.out.println(vv2);

		System.out.println("====== join method =====");

// word convert into seantace
		String joString = String.join("-", "My", "Name", "is", "Dnyaneshwar");
		System.out.println(joString);

	}

}
