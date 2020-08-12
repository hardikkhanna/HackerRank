package com.hackerrank.solutions;

import java.util.Scanner;

public class SeperateTheNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		while (t-- > 0) {
			String str = sc.next();
			int n = str.length();
			int flag = 0;
			String x = "";
			String temp = "";
			for (int i = 1; i <= n / 2; i++) {
				x = str.substring(0, i);
				Long v = Long.parseLong(x);
				while (x.length() < n) {
					x += Long.toString(++v);
				}
				if (x.equals(str)) {
					temp = str.substring(0, i);
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				System.out.println("YES " + temp);
			else
				System.out.println("NO");

		}
		sc.close();
	}

}
