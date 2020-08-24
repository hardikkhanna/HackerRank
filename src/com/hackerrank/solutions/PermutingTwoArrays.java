package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			int[] A = new int[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			int[] B = new int[n];

			String[] BItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int BItem = Integer.parseInt(BItems[i]);
				B[i] = BItem;
			}

			String result = twoArrays(k, A, B);
			System.out.println(result);

		}
		scanner.close();
	}

	private static String twoArrays(int k, int[] a, int[] b) {
		Arrays.sort(a);
		b = Arrays.stream(b).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] + b[i] < k) {
				return "NO";
			}
		}
		return "YES";
	}
}