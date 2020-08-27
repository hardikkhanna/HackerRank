package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class GameOfStones {

	// Complete the gameOfStones function below.
	static String gameOfStones(int n) {

		return (n % 7 == 0 || n % 7 == 1) ? "Second" : "First";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			String result = gameOfStones(n);

			System.out.println(result);
		}

		scanner.close();
	}
}
