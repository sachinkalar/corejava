package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\Dell\\Desktop\\io\\hello.txt");
		
		PrintWriter out = new PrintWriter(file);
		
		for(int i=0;i<5;i++) {
			System.out.println(i+":line");
			
			
		
		out.close();
		file.close();
		
	}

}
}