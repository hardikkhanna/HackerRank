package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			String[] grid = new String[n];

			for (int i = 0; i < n; i++) {
				String gridItem = scanner.nextLine();
				grid[i] = gridItem;
			}

			String result = gridChallenge(grid);

			System.out.println(result);
		}

		scanner.close();
	}

	private static String gridChallenge(String[] grid) {

		for (int i = 0; i < grid.length; i++) {
			char[] ch = grid[i].toCharArray();
			Arrays.sort(ch);
			grid[i] = String.valueOf(ch);
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length - 1; j++) {
				if (grid[j].charAt(i) > grid[j + 1].charAt(i)) {
					return "NO";
				}
			}
		}
		return "YES";
	}

}
