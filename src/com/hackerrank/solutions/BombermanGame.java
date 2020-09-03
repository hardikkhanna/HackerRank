package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class BombermanGame {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] rcn = scanner.nextLine().split(" ");

		int r = Integer.parseInt(rcn[0]);

		int c = Integer.parseInt(rcn[1]);

		int n = Integer.parseInt(rcn[2]);

		String[] grid = new String[r];

		for (int i = 0; i < r; i++) {
			String gridItem = scanner.nextLine();
			grid[i] = gridItem;
		}

		String[] result = bomberMan(n, grid);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);

			if (i != result.length - 1) {
				System.out.println();
			}
		}

		scanner.close();
	}

	static String[] bomberMan(int n, String[] grid) {

		for (int i = 0; i < grid.length; i++) {
			int number = (int) grid[i].chars().filter(ch -> ch == 'O').count();
			for (int j = 0; j < number; j++) {
				int index = grid[i].indexOf("O");
				grid[i] = grid[i].replaceFirst("O", "1");
				if ((i - 1 >= 0) && grid[i - 1].charAt(index) != '1') {
					grid[i - 1] = grid[i - 1].substring(0, index) + "1" + grid[i - 1].substring(index + 1);
				}
				if (i + 1 <= grid.length - 1 && grid[i + 1].charAt(index) != 'O') {
					grid[i + 1] = grid[i + 1].substring(0, index) + "1" + grid[i + 1].substring(index + 1);
				}
				if (index - 1 >= 0 && grid[i].charAt(index - 1) != '1')
					grid[i] = grid[i].substring(0, index - 1) + "1" + grid[i].substring(index);
				if (index + 1 <= grid[i].length() - 1 && grid[i].charAt(index + 1) != 'O')
					if (index + 2 <= grid[i].length() - 1) {
						grid[i] = grid[i].substring(0, index + 1) + "1" + grid[i].substring(index + 2);
					} else {
						grid[i] = grid[i].substring(0, index + 1) + "1";
					}
			}
			grid[i] = grid[i].replace(".", "O");
		}
		for (int i = 0; i < grid.length; i++)
			grid[i] = grid[i].replace("1", ".");
		return grid;

	}
}