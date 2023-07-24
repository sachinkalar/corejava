package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExternalize {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Dell\\Desktop\\io\\Externalization.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		WithExternalize we = new WithExternalize();
		
		
		we.id = 1;
		we.name = "sachin";
		we.lastname = "kalar";
		we.salary = 5000;
		
		out.writeObject(we);
		
		out.close();
		file.close();
	}

}
