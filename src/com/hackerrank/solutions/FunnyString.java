package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			funnyString(str);
		}
		sc.close();
	}

	private static void funnyString(String str) {
		StringBuilder st = new StringBuilder(str);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			list.add((int) Math.abs(str.charAt(i) - str.charAt(i + 1)));
		}
		st = st.reverse();
		str = st.toString();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			list2.add((int) Math.abs(str.charAt(i) - str.charAt(i + 1)));
		}
		if (list.equals(list2)) {
			System.out.println("Funny");
		} else {
			System.out.println("Not Funny");
		}
	}

}
