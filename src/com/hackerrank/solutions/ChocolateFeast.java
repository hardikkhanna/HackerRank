package com.hackerrank.solutions;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int totalMoney = sc.nextInt();
			int cost = sc.nextInt();
			int wrapperPrice = sc.nextInt();
			chocolateFeast(totalMoney, cost, wrapperPrice);
		}
		sc.close();

	}

	private static void chocolateFeast(int totalMoney, int cost, int wrapperPrice) {

		int chocolateBought = totalMoney / cost;
		int wrapper = chocolateBought;
		while (wrapper >= wrapperPrice) {
			int ex_chocs = wrapper / wrapperPrice;
			wrapper = ex_chocs + wrapper % wrapperPrice;
			chocolateBought += ex_chocs;
		}
		System.out.println(chocolateBought);
	}

}
