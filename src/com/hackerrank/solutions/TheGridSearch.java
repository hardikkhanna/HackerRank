package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			String[] arr1 = new String[R];
			for (int i = 0; i < R; i++) {
				arr1[i] = sc.next();
			}
			int r = sc.nextInt();
			int c = sc.nextInt();
			String[] arr2 = new String[r];
			for (int i = 0; i < r; i++) {
				arr2[i] = sc.next();
			}
			theGridSearch(arr1, arr2, R, C, r, c);
		}
		sc.close();

	}

	private static void theGridSearch(String[] arr1, String[] arr2, int R, int C, int r, int c) {
		boolean flag = false;
		for (int k = 0; k < R - r; k++) {
			for (int m = 0; m < arr1[k].length() - c; m++) {
				String[] compare = new String[r];
				int index = 0;
				for (int i = k; i < k + r; i++) {
					compare[index++] = arr1[i].substring(m, m + c);
				}
				if (Arrays.equals(compare, arr2)) {
					flag = true;
					break;
				}
			}
		}
		if (flag == true) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

}
