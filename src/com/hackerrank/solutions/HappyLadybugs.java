package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class HappyLadybugs {

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int size = sc.nextInt();
			String input = sc.next();
			happyLadybugs(input);
		}
		sc.close();
	}

	private static void happyLadybugs(String input) {
		if (!input.contains("_")) {
			System.out.println("NO");
			return;
		}
		if (input.length() == 1) {
			System.out.println("YES");
			return;
		}

		char[] arr = input.toCharArray();
		Arrays.sort(arr);
		input = "";
		for (int i = 0; i < arr.length; i++) {
			input += arr[i];
		}

		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) != input.charAt(j)) {
					break;
				}
				count++;
			}
			if (count > 0) {
				String str = input.substring(i, i + count + 1);
				// str = str.replace(str, "_");
				input = input.replace(str, "_");
			}
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '_') {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
