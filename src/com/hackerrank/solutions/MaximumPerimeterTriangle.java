package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumPerimeterTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		maximumPerimeterTriangle(arr);
		sc.close();

	}

	private static void maximumPerimeterTriangle(int[] arr) {
		Arrays.sort(arr);
		long sum = 0, max = -1;
		int startIndex = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] + arr[i + 2] <= arr[i + 1] || arr[i] + arr[i + 1] <= arr[i + 2]
					|| arr[i + 1] + arr[i + 2] <= arr[i]) {
				continue;
			}
			sum = (long) arr[i] + arr[i + 1] + arr[i + 2];
			if (sum > max) {
				max = sum;
				startIndex = i;
			}

		}
		if (max > 0) {
			for (int i = startIndex; i < startIndex + 3; i++) {
				System.out.print(arr[i] + " ");
			}
		} else
			System.out.println(max);
	}

}
