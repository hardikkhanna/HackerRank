package com.hackerrank.solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (int) str.charAt(i) - 'a' + 1;
			set.add(sum);
			if ((i + 1 < str.length()) && (str.charAt(i) != str.charAt(i + 1))) {
				sum = 0;
			}
		}
		int[] queries = new int[n];
		for (int i = 0; i < queries.length; i++) {
			queries[i] = sc.nextInt();
			if (set.contains(queries[i])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();

	}

}
