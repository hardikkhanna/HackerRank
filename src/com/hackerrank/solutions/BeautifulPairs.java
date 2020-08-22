package com.hackerrank.solutions;

import java.util.Scanner;

public class BeautifulPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		beautifulPairs(arr, arr1);
		sc.close();

	}

	private static void beautifulPairs(int[] arr, int[] arr1) {

	}

}
