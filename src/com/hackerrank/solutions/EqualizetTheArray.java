package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class EqualizetTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int minSteps = equalizeTheArray(list);
		System.out.println(minSteps);
		sc.close();
	}

	private static int equalizeTheArray(List<Integer> theList) {
		int count = 0;
		// to get the max number of occurences of an element from list
		Integer maxOccurredElement = theList.stream()
				.reduce(BinaryOperator
						.maxBy((o1, o2) -> Collections.frequency(theList, o1) - Collections.frequency(theList, o2)))
				.orElse(null);
		theList.removeAll(Collections.singleton(maxOccurredElement));
		count = theList.size();
		return count;
	}

}
