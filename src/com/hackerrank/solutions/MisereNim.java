package com.hackerrank.solutions;

import java.io.IOException;
import java.util.Scanner;

public class MisereNim {
	static boolean misereNim(int[] stones) {

        if (stones.length == 1) {
            return stones[0] > 1;
        }
        
        int totalStones = stones[0];
        int xorValue = stones[0];
        
        for (int s = 1; s < stones.length; s++) {
            totalStones += stones[s];
            xorValue ^= stones[s];
        }
        
        /* If sum of all stones equals the total piles, all piles have a single (1)
         * stone. For even number of piles, first player will always win.
         */
        if (totalStones == stones.length) {
            return totalStones % 2 == 0;
        }
        
        /* For all other cases, the xor value determines winner. If xor value = 0,
         * then second player will always win as all piles (stones) can be paired. 
         */
        return xorValue > 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] s = new int[n];

            String[] sItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int sItem = Integer.parseInt(sItems[i]);
                s[i] = sItem;
            }

            boolean result = misereNim(s);
            if(result == true)
            	System.out.println("First");
            else
            	System.out.println("Second");
        }

        scanner.close();
    }

}
