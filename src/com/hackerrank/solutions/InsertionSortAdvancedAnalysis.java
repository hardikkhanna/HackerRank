package com.hackerrank.solutions;

import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			insertionSortAdvanced(arr);
		}
		sc.close();

	}

	private static void insertionSortAdvanced(int[] arr) {
		// in TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				count++;
			}
		}
		System.out.println(count);
	}

}
