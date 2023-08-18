package com.has.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {

		Address address = new Address("pune", "Jamkhed", 413204);

		Student s = new Student(10, "mauli", address);

		Student s1 = new Student(20, "Suraj", address);

		FileOutputStream fout = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		out.writeObject(s1);
		System.out.println("success....!!!!");

		out.close();
	}

}
//HAS-A serialization
//Aggregation & composition