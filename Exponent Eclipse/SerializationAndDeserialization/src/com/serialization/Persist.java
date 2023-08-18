package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args)throws IOException { // main method
		
		
		Emoloyee e = new Emoloyee(101,"mauli","pune");// e object employee
 
		Emoloyee e1 = new Emoloyee(102,"Sumit","nager");
		
		FileOutputStream fout = new FileOutputStream("outstream.text"); //file output stream
		ObjectOutputStream out = new ObjectOutputStream(fout);//object output stream
		out.writeObject(e);//calling
		out.writeObject(e1);
		System.out.println("success....!!!!");
		
		out.close();
	}

}
//serialization persist byte code  conversion