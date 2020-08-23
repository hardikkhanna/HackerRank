package com.hackerrank.solutions;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		maximizingXOR(l, r);
		sc.close();

	}

	private static void maximizingXOR(int l, int r) {
		int max = Integer.MIN_VALUE;
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				int xor = i ^ j;
				if (xor > max) {
					max = i ^ j;
				}
			}
		}
		System.out.println(max);
	}

}
