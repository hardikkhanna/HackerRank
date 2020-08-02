package com.hackerrank.solutions;

import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int b = sc.nextInt();
			int w = sc.nextInt();
			int bc = sc.nextInt();
			int wc = sc.nextInt();
			int z = sc.nextInt();
			long cost = taumBday(b,w,bc,wc,z);
			System.out.println(cost);
		}
	}

	private static long taumBday(int b, int w, int X, int Y, int Z) {
		
		long cost  = 0;
		long priceB = Math.min(X, Y + Z); // conversion price
        long priceW = Math.min(Y, X + Z);
		cost = priceB*b + priceW*w;
		
		return cost;
	}

}
