package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class NIMGame {

	static String nimGame(int[] pile) {
		int i, xor;
		xor = pile[0];
		for (i = 0; i < pile.length - 1; i++) {
			xor = xor ^ pile[i + 1];
		}
		if (xor == 0) {
			return "Second";
		} else {
			return "First";
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int g = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int gItr = 0; gItr < g; gItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] pile = new int[n];

			String[] pileItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int pileItem = Integer.parseInt(pileItems[i]);
				pile[i] = pileItem;
			}

			String result = nimGame(pile);
			System.out.println(result);
		}

		scanner.close();
	}

}
