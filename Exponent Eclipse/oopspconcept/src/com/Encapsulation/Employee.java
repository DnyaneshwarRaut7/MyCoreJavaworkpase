package com.Encapsulation;

public class Employee {

	private int id;
	private String name;
	private double sallary;
	private String address;

	public void setId(int id) {
		if(id<100)
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		if(name.startsWith("D"))
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public double getSallary() {
		return sallary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {

		Employee e = new Employee();

		e.setId(88);//condition 100 less than
		e.setName("Dnyaneshwar");
		e.setSallary(25000);
		e.setAddress("Pune");

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSallary());
		System.out.println(e.getAddress());
	}

}
//encapsulation of setter & getter
