package com.trywithresorurces;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) throws IOException   {

		try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {

			String s = "Welcome to java class";
			byte bytearry[] = s.getBytes(); // converting string into byte

			fileOutputStream.write(bytearry);

			System.out.println("message written to fle succ essfuly");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
