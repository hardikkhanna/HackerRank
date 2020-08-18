package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			a.add(scan.nextInt());
		int m = scan.nextInt();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < m; i++)
			b.add(scan.nextInt());
		HashSet<Integer> hs = new HashSet<Integer>(a);
		for (int i : hs)
			if (Collections.frequency(a, i) != Collections.frequency(b, i))
				System.out.print(i + " ");
		scan.close();

	}

	

}
