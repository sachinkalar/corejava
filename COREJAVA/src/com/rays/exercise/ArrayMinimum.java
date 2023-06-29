package com.rays.exercise;

public class ArrayMinimum {
	public static void main(String[] args) {

		int arr[] = { 10, 11, 12, 13, 14 };
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < a) {
				a = arr[i];
			}


		}
			System.out.println(a);
	}
}