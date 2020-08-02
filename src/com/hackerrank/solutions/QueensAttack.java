package com.hackerrank.solutions;

import java.util.Scanner;

public class QueensAttack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r_q = sc.nextInt() - 1;
		int c_q = sc.nextInt() - 1;
		int[][] arr = new int[n][n];
		arr[r_q][c_q] = 1;
		for (int i = 0; i < k; i++) {
			int ob1 = sc.nextInt();
			int ob2 = sc.nextInt();
			arr[ob1 - 1][ob2 - 1] = -1;
		}

		int moves = queensAttack(arr, r_q, c_q, n);
		System.out.println(moves);
		sc.close();
	}

	private static int queensAttack(int[][] arr, int r_q, int c_q, int n) {
		int count = 0;
		if (n == 1 && arr[r_q][c_q] == 1) {
			return count;
		}
		// Moving Backward towards left
		for (int i = c_q - 1; i >= 0; i--) {
			if (arr[r_q][i] == -1) {
				break;
			}
			count++;
			arr[r_q][i] = 2;
		}
		// Moving Forward towards Right
		for (int i = c_q + 1; i < n; i++) {
			if (arr[r_q][i] == -1) {
				break;
			}
			count++;
			arr[r_q][i] = 2;
		}

		// Moving up
		for (int i = r_q + 1; i < n; i++) {
			if (arr[i][c_q] == -1) {
				break;
			}
			count++;
			arr[i][c_q] = 2;
		}

		// Moving Downwards
		for (int i = r_q - 1; i >= 0; i--) {
			if (arr[i][c_q] == -1) {
				break;
			}
			count++;
			arr[i][c_q] = 2;
		}

		// Moving Diagonally
		// Moving UP Right Diagonally
		int k = c_q + 1;
		for (int i = r_q + 1; i < n; i++) {
			if (k < n) {
				if ((arr[i][k] == -1)) {
					break;
				}
				count++;
				arr[i][k++] = 2;
			}
		}

		// Moving UP Left Diagonally
		k = c_q - 1;
		for (int i = r_q + 1; i < n; i++) {
			if (k >= 0) {
				if ((arr[i][k] == -1)) {
					break;
				}
				count++;
				arr[i][k--] = 2;
			}
		}

		// Moving Down Left
		k = c_q - 1;
		for (int i = r_q - 1; i >= 0; i--) {
			if (k >= 0) {
				if ((arr[i][k] == -1)) {
					break;
				}
				count++;
				arr[i][k--] = 2;
			}
		}

		// Moving Down Right
		k = c_q + 1;
		for (int i = r_q - 1; i >= 0; i--) {
			if (k < n) {
				if (arr[i][k] == -1) {
					break;
				}
				count++;
				arr[i][k++] = 2;
			}

		}
		return count;

	}
}
