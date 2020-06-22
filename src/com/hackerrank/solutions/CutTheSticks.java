package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CutTheSticks {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		List<Integer> ans = cutTheSticks(list);
		System.out.println(ans);
		sc.close();

	}

	private static List<Integer> cutTheSticks(List<Integer> list) {
		List<Integer> withoutDup = list.stream().sorted().collect(Collectors.toList());
		List<Integer> finalList = new ArrayList<Integer>();
		finalList.add(withoutDup.size());
		for (int i = 1; i < withoutDup.size(); i++) {
			if (withoutDup.get(i) != withoutDup.get(i - 1)) {
				finalList.add(withoutDup.size() - i);
			}
		}
		return finalList;

	}

}
