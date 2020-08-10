package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();

		}
		arr = bigSorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static String[] bigSorting(String[] arr) {
		Arrays.sort(arr, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
		return arr;
	}

}
