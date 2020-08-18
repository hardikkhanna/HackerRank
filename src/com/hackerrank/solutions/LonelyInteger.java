package com.hackerrank.solutions;

import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = lonelyInteger(arr);
		System.out.println(ans);
		sc.close();
	}

	private static int lonelyInteger(int[] arr) {
		int val = 0;
		for (int num : arr) {
			val = val ^ num; // ^ is XOR operator
		}
		return val;
	}

}
