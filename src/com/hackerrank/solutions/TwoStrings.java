package com.hackerrank.solutions;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str1 = sc.next();
			String str2 = sc.next();
			boolean check = false;
			char[] ch = str1.toCharArray();
			for (char c : ch) {
				int index = str2.indexOf(c);
				if (index != -1) {
					check = true;
				}
			}
			if (check) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
