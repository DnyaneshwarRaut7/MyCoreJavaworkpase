package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dpersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("outstream.text"));//Input object

		Emoloyee employee = (Emoloyee) in.readObject();//calling 

		Emoloyee employee1 = (Emoloyee) in.readObject();

		System.out.println(employee.empid + " " + employee.empname + " " + employee.empaddress);

		System.out.println(employee1.empid + " " + employee1.empname + " " + employee1.empaddress);

		in.close();

	}

}
//Deserialization Dpersist byte code two main variable  conversion