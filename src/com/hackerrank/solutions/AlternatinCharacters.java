package com.hackerrank.solutions;

import java.util.Scanner;

public class AlternatinCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String test = sc.next();

			int count = 0;
			for (int j = 0; j < test.length() - 1; j++) {
				if (test.charAt(j) == test.charAt(j + 1))
					count++;
			}
			System.out.println(count);

		}
		sc.close();

	}

}
