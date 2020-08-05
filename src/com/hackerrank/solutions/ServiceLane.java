package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		while (t-- >= 0) {
			int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();
			serviceLane(startIndex, endIndex, arr);
		}

		sc.close();

	}

	private static void serviceLane(int startIndex, int endIndex, int[] arr) {

		List<Integer> list = new ArrayList<>();
		for (int i = startIndex; i <= endIndex; i++) {
			list.add(arr[i]);
		}
		list  = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list.get(0));
	}

}
