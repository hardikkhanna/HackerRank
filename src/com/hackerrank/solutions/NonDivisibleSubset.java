package com.hackerrank.solutions;

import java.util.Scanner;

public class NonDivisibleSubset {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = nonDivisibleSusbet(arr , k);
		System.out.println(ans);
		sc.close();
	}

	private static int nonDivisibleSusbet(int[] arr, int k) {
		// TODO Auto-generated method stub
		int maximumSubset = 0;
	    //creating an array with all possible remainder fo k
	    int[] remainders = new int[k];

	    //loop through the array arr and get the frequency of the remainders
	    for(int val: arr){
	        int rem = val%k;
	        remainders[rem]++;
	    }
	    //consider a case when k is even. eg. k=6 then remainder 3+3 is 6 so can not be cnsidered.
	    if(k%2==0){
	        remainders[k/2] = Math.min(remainders[k/2], 1);
	    }
	    //consider a case where we take number that is divisible by k into consideration,
	    //there is only 1 number can be considered e.g. k=3 then we can either consider 3 or 9 both can not be considered together.
	    maximumSubset = Math.min(remainders[0], 1);

	    //loop through the array of remainders array and get the max of remainder[i] or remainder[i-k]
	    for(int i=1;i<=k/2;i++){
	        maximumSubset+=Math.max(remainders[i], remainders[k-i]);
	    }

	    return maximumSubset;
	}

}
