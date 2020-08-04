package com.hackerrank.solutions;

import java.util.Scanner;

public class HalloweenSale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		halloweenSale(p, d, m, s);
		sc.close();

	}

	private static void halloweenSale(int p, int d, int m, int s) {
		int count = 0;
		for (int i = p; i <= s;) {
			if (p - d < m) {
				p = m;
			} else {
				p = p - d;
			}
			i += p;
			count++;
		}
		System.out.println(count);
	}
}
