package com.hackerrank.solutions;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int minSteps = jumpOnClouds(arr);
		System.out.println(minSteps);
		sc.close();
	}

	private static int jumpOnClouds(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				if ((i + 2 < arr.length) && (arr[i + 2] == 0)) {
					count++;
					i++;
					continue;
				} else if (arr[i + 1] == 0) {
					count++;
				}
			}
		}
		return count;
	}

}
