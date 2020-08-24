package com.hackerrank.solutions;

import java.util.Scanner;

public class SumVsXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long result = sumXor(n);
		System.out.println(result);
		sc.close();
	}

	private static long sumXor(long n) {
		long c = 0;
		while (n > 0) {
			if (n % 2 == 0)
				c++;
			n /= 2;
		}
		return (long) Math.pow(2, c);
	}

}
