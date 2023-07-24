package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChechByConsole {
	
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in); 
		BufferedReader file = new BufferedReader(in);

		PrintWriter out = new PrintWriter("C:\\Users\\Dell\\Desktop\\io\\email1.txt");
		

		String line = file.readLine();

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		while (!line.equals("q")) {

			if (line.matches(emailreg)) {
		     
		     out.println(line);
			} else {
				System.out.println("invalid : " + line);
			}
			line = file.readLine();

		}
		out.close();
        file.close();


	}
	

}