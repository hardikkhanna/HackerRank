package com.hackerrank.solutions;

import java.util.Scanner;

public class CountingSortII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		countingSortI(arr);
		sc.close();
	}

	private static void countingSortI(long[] arr) {

		int[] countArray = new int[100];
		for (int i = 0; i < arr.length; i++) {
			countArray[(int) arr[i]] = countArray[(int) arr[i]] + 1;
		}
		for (int i = 0; i < countArray.length; i++) {
			if(countArray[i] != 0) {
				while(countArray[i]-->0) {
					System.out.print(i + " ");
				}
			}
		}

	}

}
