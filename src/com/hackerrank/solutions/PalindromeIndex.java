package com.hackerrank.solutions;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			int index = palindromeIndex(str);
			System.out.println(index);
		}
		sc.close();

	}

	private static int palindromeIndex(String s) {
		int l = s.length();
		int i, j, a, b;
		for (i = 0, j = l - 1; i < l; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				break;
		}
		if (i > j)
			return -1;

		for (a = i + 1, b = j; a < j && b > i + 1; a++, b--) {
			if (s.charAt(a) != s.charAt(b))
				return j;
		}
		return i;

	}

}
