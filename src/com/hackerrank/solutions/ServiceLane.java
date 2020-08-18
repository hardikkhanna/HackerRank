package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nt = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nt[0]);

		int t = Integer.parseInt(nt[1]);

		int[] width = new int[n];

		String[] widthItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int widthItem = Integer.parseInt(widthItems[i]);
			width[i] = widthItem;
		}

		int[][] cases = new int[t][2];

		for (int i = 0; i < t; i++) {
			String[] casesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int casesItem = Integer.parseInt(casesRowItems[j]);
				cases[i][j] = casesItem;
			}
		}

		int[] result = serviceLane(n, cases, width);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		scanner.close();

	}

	private static int[] serviceLane(int n, int[][] cases, int[] w) {
		int[] arr = new int[cases.length];

		for (int i = 0; i < cases.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int startIndex = cases[i][0];
			int endIndex = cases[i][1];
			for (int j = startIndex; j <= endIndex; j++) {
				list.add(w[j]);
			}
			Collections.sort(list);
			arr[i] = list.get(0);
		}
		return arr;

	}

}
