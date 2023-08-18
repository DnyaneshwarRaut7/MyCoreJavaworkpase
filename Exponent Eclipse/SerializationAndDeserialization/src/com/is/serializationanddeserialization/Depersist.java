package com.is.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("out.txt"));

		Child cc = (Child) input.readObject();

		System.out.println(cc.id);
		System.out.println(cc.name);
		System.out.println(cc.address);

		System.out.println(cc.cid);
		System.out.println(cc.cname);
		System.out.println(cc.address);

		input.close();
	}

}

//IS-A serialization byte of stream to plane formatedata