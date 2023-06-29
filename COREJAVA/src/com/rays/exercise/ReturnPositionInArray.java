package com.rays.exercise;

public class ReturnPositionInArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 ,6,7,8,9,12,11,23,33,43};
		int count = -1;
		int b = 33;
		for (int i = 0; i < a.length; i++) {
			if (a[i] ==b) {
				count=i;
			}
		}
		System.out.println(count);
	}

}
  