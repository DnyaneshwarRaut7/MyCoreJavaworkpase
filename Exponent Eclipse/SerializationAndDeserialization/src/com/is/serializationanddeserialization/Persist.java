package com.is.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {

		Child c = new Child();

		c.id = 101;
		c.name = "mauli";
		c.address = "pune";

		c.cid = 201;
		c.cname = "suraj";
		c.caddress = "rajuri";

		FileOutputStream F = new FileOutputStream("out.txt");
		ObjectOutputStream oo = new ObjectOutputStream(F);
		oo.writeObject(c);

		System.out.println("Sucess IS-A byte of Stream");

		oo.close();
	}

}

//IS-A serialization byte of stream 