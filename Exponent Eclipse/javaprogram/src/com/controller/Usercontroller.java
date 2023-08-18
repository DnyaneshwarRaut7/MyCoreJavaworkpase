package com.controller;
import com.service.*;
import com.data.*;
import com.table.*;
public class Usercontroller {

		public int id=66;
		public String name="Mauli";
		public String name1="Raut";
		
		public void m1()
{
    System.out.println("---m1 method---");
} 
   
		public static void main(String[] args) {
		
		System.out.println("===Welcome to java Eclipse First program===");
		
		Usercontroller u = new Usercontroller();
		u.m1();
		System.out.println(u.id);
		System.out.println(u.name);
		System.out.println(u.name1);
		
	   Userservice u1 = new Userservice();
	   u1.m2();
	   System.out.println(u1.r);
	   System.out.println(u1.name);
	   System.out.println(u1.name1);
	 
	   Aa x = new Aa();
	   x.m21();
	   System.out.println(x.a);
	   System.out.println(x.name);
	   System.out.println(x.name1);
	   Userdata u2 = new Userdata();
	   u2.m3();
	   System.out.println(u2.i);
	   System.out.println(u2.name);
	   System.out.println(u2.name1);
	   
	   Usertable u3 = new Usertable();
	   u3.add();
	   System.out.println(u3.l);
	   System.out.println(u3.name);
       System.out.println(u3.name1);
       System.out.println(u3.name2);
	   
	}
	}


