package com.hackerrank.solutions;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		int n = 2;
		while (3 * (n - 1) < t)
			n = 2 * n;
		System.out.println((3 * (n - 1) - t + 1));
		sc.close();

	}

}
