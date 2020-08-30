package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class ChessboardGame {
	static String chessboardGame(int x, int y) {

		x = x % 4;
		y = y % 4;
		if ((y == 0) || (y == 3) || (x == 0) || (x == 3))
			return "First";
		return "Second";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] xy = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xy[0]);

			int y = Integer.parseInt(xy[1]);

			String result = chessboardGame(x, y);
			System.out.println(result);
		}

		scanner.close();
	}
}
