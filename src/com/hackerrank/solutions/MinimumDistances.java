package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinimumDistances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = minimumDistance(arr);
		System.out.println(ans);
		sc.close();

	}

	private static int minimumDistance(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.add(Math.abs(i - j));
					break;
				}
			}
		}
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		if (sortedList.isEmpty()) {
			sortedList.add(-1);
		}
		return sortedList.get(0);
	}
}
