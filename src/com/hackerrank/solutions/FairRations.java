package com.hackerrank.solutions;

import java.util.Scanner;

public class FairRations {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		fairRations(arr, sum);
		sc.close();
	}

	private static void fairRations(int[] arr, int sum) {
		int count = 0;
		if (sum % 2 == 1) {
			System.out.println("NO");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					arr[i] = arr[i] + 1;
					arr[i + 1] = arr[i + 1] + 1;
					count += 2;
				}

			}
			System.out.println(count);
		}
	}
}
