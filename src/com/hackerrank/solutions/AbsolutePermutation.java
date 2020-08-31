package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbsolutePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			List<Integer> list = new ArrayList<Integer>();
			int num = sc.nextInt();
			int k = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				list.add(i);
			}
			absolutePermutation(num, k, list);
		}
		sc.close();

	}

	private static void absolutePermutation(int num, int k, List<Integer> list) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			ans.add(0);
		}
		int value = 0;
		for (int i = 1; i <= num; i++) {
			if (i - k > 0 && list.contains(i - k))
				value = i - k;
			else
				value = i + k;

			if (list.contains(value)) {
				ans.set(i - 1, value);
				list.remove(list.indexOf(value));
			}

		}
		if (list.isEmpty()) {
			for (int i = 0; i < ans.size(); i++) {
				System.out.print(ans.get(i) + " ");
			}
		} else {
			System.out.print(-1);
		}
		System.out.println();
	}

}
