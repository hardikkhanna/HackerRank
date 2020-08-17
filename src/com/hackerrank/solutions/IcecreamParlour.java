package com.hackerrank.solutions;

import java.util.Scanner;

public class IcecreamParlour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int money = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			icecreamParlour(arr, money);
		}
		sc.close();

	}

	private static void icecreamParlour(int[] arr, int money) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == money) {
					System.out.println(i + 1 + " " + Integer.sum(j, 1));
					return;
				}
			}
		}

	}

}
