package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		marksAndToys(arr, amount);
		sc.close();
	}

	private static void marksAndToys(int[] arr, int amount) {
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + sum <= amount) {
				sum += arr[i];
				count++;
				continue;
			}
			if (max < count) {
				max = count;
			}
			count = 0;
		}
		System.out.println(max);
	}

}
