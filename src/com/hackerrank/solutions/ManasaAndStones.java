package com.hackerrank.solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (t-- > 0) {
			Integer[] ans = manasaAndStones(n, a, b);
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] + "");
			}
		}
		sc.close();

	}

	private static Integer[] manasaAndStones(int n, int a, int b) {

		Set<Integer> set = new HashSet<Integer>();
		Integer[] arrStones = new Integer[n];
		for (int i = 0; i < n; i++) {
			int temp = a * ((n - 1) - i) + b * i;
			set.add(temp);
		}
		arrStones = set.stream().sorted().toArray(Integer[]::new);
		return arrStones;

	}

}
