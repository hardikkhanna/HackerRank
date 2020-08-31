package com.hackerrank.solutions;

import java.util.Scanner;

public class SurfaceArea {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H][W];
		int k = sc.nextInt();
		int result=0;
	      int row = A.length;
	      int column = A[0].length;
	      for(int i=0;i<row;i++) {
	        int visibleFacesPerRow = 0;
	        for(int j=0;j<column;j++) {
	          int visibleFacesPerCell = 0;
	          int totalFaces=A[i][j]*6;
	          int connectedFaces=(A[i][j]-1)*2;
	          if (j + 1 <= column - 1) {
	            connectedFaces += Math.min(A[i][j + 1], A[i][j]);
	          }
	          if (j - 1 >= 0) {
	            connectedFaces += Math.min(A[i][j - 1], A[i][j]);
	          }
	          if (i + 1 <= row - 1) {
	            connectedFaces += Math.min(A[i + 1][j], A[i][j]);
	          }
	          if (i - 1 >= 0) {
	            connectedFaces += Math.min(A[i - 1][j], A[i][j]);
	          }          
	          visibleFacesPerCell = totalFaces - connectedFaces;
	          visibleFacesPerRow += visibleFacesPerCell;
	        }
	        result += visibleFacesPerRow;
	      }
		System.out.println(result);
		sc.close();
	}

}
