package com.rays.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyboard {
	public static void main(String[] args) throws Exception {
		
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader file = new BufferedReader(in);
	
	PrintWriter out = new PrintWriter("C:\\Users\\Dell\\Desktop\\io\\sachin.txt");
	
	String line = file.readLine();
	
	while(!line.equals("quit")) {
		
		out.println(line);
		line = file.readLine();
		
		
	}
	out.close();
	file.close();

	}

}
