package com.hackerrank.solutions;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int chapters = scanner.nextInt();
		int maxProblemsPerPage = scanner.nextInt();

		int[] arr = new int[chapters];

		for (int i = 0; i < chapters; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = 0;
		int page = 1;

		// chapter
		for (int i = 0; i < arr.length; i++) {
			int problems = arr[i];

			// problems
			for (int problem = 1; problem <= problems; problem++) {

				if (problem == page) {
					result++;
				}

				if ((problem % maxProblemsPerPage == 0) || problem == problems) {
					page++;
				}

			}

		}

		System.out.println(result);

	}
}
