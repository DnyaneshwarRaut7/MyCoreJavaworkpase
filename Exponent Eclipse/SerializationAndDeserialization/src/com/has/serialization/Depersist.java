 package com.has.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ino = new ObjectInputStream (new FileInputStream ("output.txt"));
		
		Student ss = (Student)ino.readObject();
		Student ss2 = (Student)ino.readObject();
		
		System.out.println(ss.sid+" "+ss.sname+" "+ss.address.LocalAddress+" "+ss.address.PerAddress+" "+ss.address.pincode);
		System.out.println(ss2.sid+" "+ss2.sname+" "+ss2.address.LocalAddress+" "+ss.address.PerAddress+" "+ss.address.pincode);
       
		ino.close();
	}

}
//HAS-A deserilazation
//Aggregation & composition