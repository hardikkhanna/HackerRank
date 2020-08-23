package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LargestPermutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] numbers = new int[n];
		Integer[] numbersAux = new Integer[n];
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			numbers[i] = numbersAux[i] = a;
			map.put(a, i);
		}

		if (numbers[0] != n) {
			Arrays.sort(numbersAux, Collections.reverseOrder());

			for (int i = 0, count = 0; i < n && count < k; i++) {
				if (numbers[i] != numbersAux[i]) {
					int ind = map.get(numbersAux[i]);
					swap(numbers, i, ind);
					map.put(numbers[i], i);
					map.put(numbers[ind], ind);
					count++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + " ");

		}
		s.close();
	}

	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}