package com.hackerrank.solutions;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		String sos = "SOS";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != sos.charAt(i % 3))
				count++;
		}
		System.out.println(count);
		sc.close();

	}

}
