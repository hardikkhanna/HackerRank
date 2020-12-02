package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int k = s.nextInt();
		findPairsDifferenceK(input, k);
		s.close();
	}

	private static void findPairsDifferenceK(int[] input, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : input) {
			int p1 = i + k;
			boolean flag = false;
			if (i == p1)
				flag = true;
			if (map.containsKey(p1)) {
				int f2 = map.get(p1);
				for (int j = 0; j < f2; j++) {
					if (p1 < i) {
						System.out.println(p1 + " " + i);
					} else {
						System.out.println(i + " " + p1);
					}
				}
			}
			int p2 = i - k;
			if (map.containsKey(p2) && !flag) {
				int f2 = map.get(p2);
				for (int j = 0; j < f2; j++) {
					if (p2 < i) {
						System.out.println(p2 + " " + i);
					} else {
						System.out.println(i + "  " + p2);
					}
				}
			}
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}

		}

	}
}
