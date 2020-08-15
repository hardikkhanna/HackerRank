package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindTheMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int ans = findTheMedian(list);
		System.out.println(ans);
		sc.close();

	}

	private static int findTheMedian(List<Integer> list) {
		Collections.sort(list);
		return list.get((int) Math.ceil(list.size() / 2));

	}

}
