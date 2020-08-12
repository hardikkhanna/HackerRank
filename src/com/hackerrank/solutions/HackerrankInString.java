package com.hackerrank.solutions;

import java.util.Scanner;

public class HackerrankInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			String hackerrank = "hackerrank";
			int j = 0;
			for (int i = 0; i < str.length(); i++) {
				if ((j < hackerrank.length()) && (hackerrank.charAt(j) == str.charAt(i))) {
					j++;
				}

			}
			if (j == hackerrank.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
