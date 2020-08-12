package com.hackerrank.solutions;

import java.util.Scanner;

public class Pangrams {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[26];
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}
			freq[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 0) {
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("pangram");
		sc.close();

	}

}
