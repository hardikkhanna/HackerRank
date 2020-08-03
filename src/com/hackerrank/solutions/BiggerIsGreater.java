package com.hackerrank.solutions;

import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			lexicographicalOrder(str);
		}
		sc.close();
	}

	private static void lexicographicalOrder(String str) {
		String originalString = str;
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder(str);
			for (int j = i + 1; j < str.length(); j++) {

				sb.setCharAt(i, str.charAt(j));
				sb.setCharAt(j, str.charAt(i));
				if (originalString.compareTo(sb.toString()) < 0) {
					ans = sb.toString();
					break;
				}
			}

			str = originalString;
		}
		if (ans == "") {
			System.out.println("no answer");
		}
		System.out.println(ans);
	}
}
