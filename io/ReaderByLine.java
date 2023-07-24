package com.rays.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Dell\\Desktop\\io\\hello.txt");
		
		BufferedReader bf = new BufferedReader(file);
		
		String str = bf.readLine();
		
		while(str != null) {
			
			System.out.println(str);
			
		 str = bf.readLine();
		}
		bf.close();
		file.close();
	}

}
