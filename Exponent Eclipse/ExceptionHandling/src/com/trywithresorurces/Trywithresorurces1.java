package com.trywithresorurces;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Trywithresorurces1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	ObjectInputStream ino = new ObjectInputStream (new FileInputStream ("output.txt"));
		
	FileInputStream fileInputStream = new FileInputStream("");
	fileInputStream.read();

	}

}
