package com.rays.pattern;

public class ReverseTriangle {
	public static int rt(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+"*");
			}System.out.println();
		}
		return 0;
	}

}