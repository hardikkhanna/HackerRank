package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MarcCakewalk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		cakeawalk(arr);
		sc.close();
	}

	private static void cakeawalk(int[] arr) {
		Arrays.sort(arr);
		long sum = 0, j = 0;
		for (int i = arr.length - 1; i >= 0; i--, j++) {
			sum += (long) (arr[i] * Math.pow(2, j));
		}
		System.out.println(sum);
	}

}
