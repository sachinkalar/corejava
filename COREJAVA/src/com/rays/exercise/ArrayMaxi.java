package com.rays.exercise;

public class ArrayMaxi {

		public static void main(String[] args) {

			int arr[] = { 10, 11, 1, 13, 14 };
			int a = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if ( a>arr[i]) {
					a = arr[i];
				}


			}
				System.out.println(a);
		}
	
	
}


