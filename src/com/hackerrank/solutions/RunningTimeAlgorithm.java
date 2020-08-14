package com.hackerrank.solutions;

import java.util.Scanner;

public class RunningTimeAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		runningAlgorithm(arr);
		sc.close();
	}

	private static void runningAlgorithm(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				count++;
			}
			arr[j + 1] = key;

		}

		System.out.println(count);

	}

}
