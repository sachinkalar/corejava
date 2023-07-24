package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TryExternalize {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\io\\Externalization.txt");
		 ObjectInputStream in = new ObjectInputStream(file);
		 
		 WithExternalize we = (WithExternalize) in.readObject();
		 
		 System.out.println(we.id);
		 System.out.println(we.name);
		 System.out.println(we.lastname);
		 System.out.println(we.salary);
		 
		in.close();
		file.close();
		
	}

}
