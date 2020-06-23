package com.hackerrank.solutions;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long n = sc.nextLong();
		long ans = repeatedString(str, n);
		System.out.println(ans);
		sc.close();
	}

	private static long repeatedString(String s, long n) {
		int i = 0;
		long count = 0;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				count++;
		}

		long div = n / s.length();
		long reminder = n % s.length();

		count = div * count;

		for (i = 0; i < reminder; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}

		return count;
	}

}
