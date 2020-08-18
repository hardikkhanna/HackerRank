package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			sherlockAndArray(list);
		}
		sc.close();

	}

	private static void sherlockAndArray(List<Integer> arr) {
		int sum = 0;
		// get sum of all array index.
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		// initially left sum is zero.
		int leftSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			// if left sum equals right sum print yes.
			if (leftSum == (sum - leftSum - arr.get(i))) {
				System.out.println("YES");
				return;
			}

			leftSum += arr.get(i);
		}

		System.out.println("NO");
		
	}

}
