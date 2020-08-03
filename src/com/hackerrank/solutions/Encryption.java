package com.hackerrank.solutions;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		encryption(str);
		sc.close();
	}

	private static void encryption(String str) {
		int n = str.length();
		int jump = (int) Math.sqrt(n);
		if (jump * jump != n) {
			jump++;
		}
		String ans = "";
		for (int i = 0; i < jump; i++) {
			for (int j = i; j < n; j += jump) {
				ans += str.charAt(j);
			}
			ans += " ";
		}
		System.out.println(ans);

	}

}
