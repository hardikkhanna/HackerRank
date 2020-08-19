package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		minimumAbsoluteDifference(arr);
		sc.close();
	}

	private static void minimumAbsoluteDifference(int[] arr) {
		if (arr.length == 1) {
			System.out.println(arr[0]);
			return;
		}
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			int diff = (int) Math.abs(arr[i] - arr[i + 1]);
			if (min > diff) {
				min = Math.abs(arr[i] - arr[i + 1]);;
			}

		}
		System.out.println(min);
	}

}
