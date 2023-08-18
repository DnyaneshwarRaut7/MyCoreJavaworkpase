package com.apanacollage;

import java.io.FileNotFoundException;
import java.io.IOException;


public class TestException1 {
	
	public static void main(String[] args) {
		try {
			go();
		} catch (IOException e) {
			e.printStackTrace();
		//} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
}

public static void go() throws IOException, JAXBException, FileNotFoundException{
	
}

}
