package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter write = new FileWriter("C:\\Users\\Dell\\Desktop\\io\\guddu.txt");
		
		write.write("sachin miss you"+"\n");
		
		write.write("miss you to");
		write.close();
	}
	

}
