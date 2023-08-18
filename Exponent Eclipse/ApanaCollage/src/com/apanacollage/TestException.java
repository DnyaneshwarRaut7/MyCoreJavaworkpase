package com.apanacollage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	

		public static void main(String[] args) throws FileNotFoundException {
			try {
				testExceptions();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// throws Exception
		
		public static void testExceptions() throws IOException, FileNotFoundException{
			
		}
	}
	
	


