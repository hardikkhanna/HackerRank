package com.hackerrank.solutions;

import java.util.Scanner;

public class BeautifulBinaryString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String B = sc.next();
		System.out.println((B.length() - B.replaceAll("010", "").length()) / 3);
		sc.close();
	}
}
