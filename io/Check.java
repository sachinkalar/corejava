package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Check {
	public static void main(String[] args) throws NullPointerException, IOException {
		FileReader in = new FileReader("C:\\Users\\Dell\\Desktop\\io\\sachin.txt");

		BufferedReader file = new BufferedReader(in);

		PrintWriter out = new PrintWriter("C:\\Users\\Dell\\Desktop\\io\\email.txt");
		

		String line = file.readLine();

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";

		while (!(line.equals(null))) {

			if (line.matches(emailreg)) {
		     System.out.println(line);
		     out.println(line);
			} else {
				System.out.println("invalid : " + line);
			}
			line = file.readLine();

		}
		out.close();

		in.close();

	}
}
