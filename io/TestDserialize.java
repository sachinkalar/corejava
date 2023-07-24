package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDserialize {
	public static void main(String[] args) throws Exception {
		
	FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\io\\serealize.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) in.readObject();
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.math);
		System.out.println(m.chem);
		System.out.println(m.physics);
		System.out.println(m.total);
		
		in.close();
		file.close();

	}

}
