package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetermingDNA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> arr = new ArrayList<String>();
		int[] health = new int[n];
		for (int i = 0; i < n; i++) {
			arr.add(sc.next());
		}
		for (int i = 0; i < health.length; i++) {
			health[i] = sc.nextInt();
		}
		List<Integer> ans = new ArrayList<>();
		int t = sc.nextInt();
		while (t-- > 0) {
			int first = sc.nextInt();
			int last = sc.nextInt();
			String str = sc.next();
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			ans = determiningDNA(first, last, str, arr, health, min, max);

		}
		System.out.println(ans.get(0) + " " + ans.get(1));
		sc.close();
	}

	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	private static List<Integer> determiningDNA(int first, int last, String str, List<String> list, int[] health,
			int min, int max) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				if (list.indexOf(str.charAt(i)) >= first && list.indexOf(str.charAt(i)) <= last) {
					int index = list.indexOf(str.charAt(i));
					count += health[index];
				}
			}
		}
		return null;

	}

}
