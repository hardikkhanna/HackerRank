package com.hackerrank.solutions;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		String[] arr = new String[rows];
		for (int i = 0; i < rows; i++) {
			arr[i] = sc.next();

		}
		cavityMap(arr);
		sc.close();
	}

	private static void cavityMap(String[] arr) {

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length() - 1; j++) {
				if (Integer.valueOf(arr[i].charAt(j)) <= Integer.valueOf(arr[i + 1].charAt(j))
						|| Integer.valueOf(arr[i].charAt(j)) <= Integer.valueOf(arr[i - 1].charAt(j))
						|| Integer.valueOf(arr[i].charAt(j)) <= Integer.valueOf(arr[i].charAt(j + 1))
						|| Integer.valueOf(arr[i].charAt(j)) <= Integer.valueOf(arr[i].charAt(j - 1))) {

					continue;
				}
				String str = arr[i].substring(0, j) + 'X' + arr[i].substring(j+1, arr[i].length());
				arr[i] = str;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
