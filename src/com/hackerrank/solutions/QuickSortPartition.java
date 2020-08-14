package com.hackerrank.solutions;

import java.util.Scanner;

public class QuickSortPartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		arr = quickSortPartition(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	private static int[] quickSortPartition(int[] arr) {

		int[] left = new int[arr.length - 1];
		int[] right = new int[arr.length - 1];
		int l = 0;
		int r = 0;
		int mid = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[0] > arr[i]) {
				left[l++] = arr[i];
			} else {
				right[r++] = arr[i];
			}
		}

		for (int i = 0; i < l; i++) {
			arr[i] = left[i];
		}
		for (int i = 0; i < r; i++) {
			arr[i + l + 1] = right[i];
		}
		arr[l] = mid;
		return arr;

	}

}
