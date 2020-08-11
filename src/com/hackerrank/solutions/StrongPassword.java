package com.hackerrank.solutions;

import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		int count = 0;

		if (!password.matches(".*[a-z].*")) {
			count++;
		}

		if (!password.matches(".*[A-Z].*")) {
			count++;
		}

		if (!password.matches(".*[0-9].*")) {
			count++;
		}

		if (password.matches("[a-zA-Z0-9]*")) {
			count++;
		}

		int lengthDifference = 6 - password.length();

		if (lengthDifference > 0 && count <= lengthDifference) {
			count = lengthDifference;
		}

		System.out.println(count);
		sc.close();
	}
}
