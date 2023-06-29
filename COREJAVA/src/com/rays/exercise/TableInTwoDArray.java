package com.rays.exercise;

public class TableInTwoDArray {
	
	public static void main(String[] args) {
		
		int[][] table= new int [10][10];
		
		for(int i=1;i<table.length;i++) {
			
			for(int j=1;j<table.length;j++) {
				
				table[i-1][j-1]=(i)*(j);
			
			}
		}for(int [] s:table) {
			
			for(int i=1;i<s.length;i++) {
				
				System.out.print(s[i]+"\t");

			}System.out.println();
		}
		
	
		

	}
}

