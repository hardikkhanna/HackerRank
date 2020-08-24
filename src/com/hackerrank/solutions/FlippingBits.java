package com.hackerrank.solutions;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            System.out.println(result);
        }
        scanner.close();
	}

	private static Long flippingBits(long n) {
		long maxInt=(long)Math.pow(2, 32)-1;
	    return maxInt-n;
	}

}
