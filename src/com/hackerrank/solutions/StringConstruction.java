package com.hackerrank.solutions;

import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			int count = stringCountruction(str);
			System.out.println(count);
		}
		sc.close();
	}

	private static int stringCountruction(String s) {
		return (int) s.chars().distinct().count();
	}

}
