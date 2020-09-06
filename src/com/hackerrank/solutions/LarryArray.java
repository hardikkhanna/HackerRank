package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class LarryArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			Integer[] A = new Integer[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			String result = larrysArray(A);

			System.out.println(result);
		}

		scanner.close();
	}

	private static String larrysArray(Integer[] A) {
		int n = A.length, count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j])
					count++;
			}
		}
		return (count % 2 == 0) ? "YES" : "NO";
	}

}
