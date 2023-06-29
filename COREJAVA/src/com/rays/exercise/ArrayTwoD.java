package com.rays.exercise;

public class ArrayTwoD {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9},

				
		};
				
		
				
	//	int arr[][]= {10,20,30,40}{8,7,6,6,9};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("  "+arr[i][j]);
			}
			System.out.println("");
		}
		
	}

}
