package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		// longestConsecutiveIncreasingSequence(arr);
		ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
		for (int num : ans) {
			System.out.println(num);
		}

	}

	private static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		Map<Integer, Boolean> visitedElements = new HashMap<>();
		Map<Integer, Integer> elementToIndexMapping = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			elementToIndexMapping.put(num, i);
			if (!visitedElements.containsKey(num)) {
				visitedElements.put(num, false);
			}
		}
		ArrayList<Integer> longestSequence = new ArrayList<>();
		int maxLength = 1;
		int startIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int currentStartIndex = i;
			int count = 0;
			int tempNum = num;

			// Forward Search
			while (visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
				visitedElements.put(tempNum, true);
				count++;
				tempNum++;
			}

			// Backward
			tempNum = num - 1;
			while (visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
				visitedElements.put(tempNum, true);
				count++;
				currentStartIndex = elementToIndexMapping.get(tempNum);
				tempNum--;
			}

			if (count > maxLength) {
				maxLength = count;
				startIndex = currentStartIndex;
			} else if (count == maxLength && currentStartIndex < startIndex)
				startIndex = currentStartIndex;
		}
		int startNUm = arr[startIndex];
		longestSequence.add(startNUm);
		maxLength--;
		while (maxLength != 0) {
			startNUm++;
			longestSequence.add(startNUm);
			maxLength--;
		}
		return longestSequence;

	}

}
