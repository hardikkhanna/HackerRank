package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		priyankaAndToys(arr);
		sc.close();

	}

	private static void priyankaAndToys(int[] arr) {
		int count = 1;
		Arrays.sort(arr);
		int start = arr[0] + 4;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > start)) {
				start = arr[i] + 4;
				count++;
			}
		}
		System.out.println(count);
	}

}
