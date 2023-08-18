package com.setergeter;

public class Test {

	private static final boolean True = false;

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "mauli";
		System.out.println("mauli");

		System.out.println("=====STUDENT DETAILS=====");

		s.setName("DNYANESHWAR");
		s.setAddress("PUNE");
		s.setMno(9146229448l);
		s.setCname("EXPONANT");
		s.setId(77);
		s.setDiv('A');
		s.setPer(88.8f);

		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getMno());
		System.out.println(s.getCname());
		System.out.println(s.getId());
		System.out.println(s.getDiv());
		System.out.println(s.getPer());

		Employee e = new Employee();

		System.out.println("====EMPLOYEE DETAILS====");
		e.setEname("pavan");
		e.setEaddress("nager");
		e.setEmno(8530428583l);
		e.setCname("tata");
		e.setEid(88);
		e.setPer(True);

		System.out.println(e.getEname());
		System.out.println(e.getEaddress());
		System.out.println(e.getEmno());
		System.out.println(e.getCname());
		System.out.println(e.getEid());
		System.out.println(e.isPer());

	}
}
