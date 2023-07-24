package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerealization {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Dell\\Desktop\\io\\serealize.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.id = 1;
		m.name= "reema";
		m.math= 92;
		m.physics = 87;
		m.chem = 77;
		m.total = m.math+m.chem+m.physics;
		
		
		out.writeObject(m);
		
		out.close();
		file.close();
	}
	

}
