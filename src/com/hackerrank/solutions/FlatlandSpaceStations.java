package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] stations = new int[m];
		for (int i = 0; i < m; i++) {
			stations[i] = sc.nextInt();
		}
		int ans = flatandSpaceStations(n, m, arr);
		System.out.println(ans);
		sc.close();

	}

	private static int flatandSpaceStations(int n, int m, int[] c) {
		Arrays.sort(c);
		int start = c[0];
		int trail = n - c[c.length - 1];
		int max = start;
		// System.out.println("start: "+start + " trail: "+trail);
		// for(int p : c){
		// System.out.print(p + " ");
		// }
		for (int i = 1; i < c.length; i++) {
			int local = (c[i] - c[i - 1]) / 2;
			max = local > max ? local : max;
		}
		if (max < trail) {
			return trail - 1;
		}
		if (max <= start) {
			return start;
		}

		// System.out.println("max: "+max);
		return max;
	}

}
