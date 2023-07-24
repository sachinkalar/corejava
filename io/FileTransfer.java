package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTransfer {
	
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\Dell\\Desktop\\io\\lone.jpg";
		String target = "C:\\Users\\Dell\\Desktop\\naman\\image.jpg";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = in.read();
		
		while(ch != -1) {
			
			out.write(ch);
			in.read();
		}
		out.close();
		in.close();
		
	}

}
