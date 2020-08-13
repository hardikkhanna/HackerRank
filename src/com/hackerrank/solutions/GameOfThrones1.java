package com.hackerrank.solutions;

import java.util.Scanner;

public class GameOfThrones1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a[] = new int[26];
		int rem[] = new int[26];
		boolean check = false;
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'a']++;
		}
		int sum = 0;
		for (int i = 0; i < 26; i++) {
			rem[i] = a[i] % 2;
			sum += rem[i];
			if (sum > 1) {
				check = true;
				break;
			}
		}
		if (check) {
			System.out.println("NO");
		} else
			System.out.println("YES");
		sc.close();
	}

}
