package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestReader {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Dell\\Desktop\\io\\hello.txt");
		
		int reader = file.read();
		
		while(reader != -1) {
		
		System.out.print((char)reader);
		
	reader=	file.read();
		}
		file.close();
		
	}
	

      
}
