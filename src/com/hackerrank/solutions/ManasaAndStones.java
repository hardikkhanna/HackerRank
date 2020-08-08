package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (t-- > 0) {
			int[] ans = manasaAndStones(n, a, b);
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + "");
			}
		}
		sc.close();

	}

	private static int[] manasaAndStones(int n, int a, int b) {

		int[] arrStones = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = a * ((n - 1) - i) + b * i;
			arrStones[i] = temp;
		}
		Arrays.sort(arrStones);
		return arrStones;

	}

}
