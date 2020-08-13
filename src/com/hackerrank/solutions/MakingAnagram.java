package com.hackerrank.solutions;

import java.util.Scanner;

public class MakingAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int totalLength = str1.length() + str2.length();
		char[] ch = str1.toCharArray();
		int count = 0;
		for (char c : ch) {
			int index = str2.indexOf(c);
			if (index != -1) {
				count = count + 2;
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			}
		}
		System.out.println(totalLength - count);
		sc.close();

	}

}
