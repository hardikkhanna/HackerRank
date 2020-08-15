package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> ans = closestNumbers(arr);
		System.out.println(ans);
		sc.close();

	}

	private static List<Integer> closestNumbers(int[] arr) {
		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			int j = i + 1;
			if (arr[j] - arr[i] < min) {
				min = arr[j] - arr[i];
				list.clear();
				list.add(arr[i]);
				list.add(arr[j]);

			} else if (arr[j] - arr[i] == min) {
				list.add(arr[i]);
				list.add(arr[j]);
			}

		}
		return list;
	}

}
