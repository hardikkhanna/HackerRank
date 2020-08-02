package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ICPCTeam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		acmteam(arr);
	}

	private static void acmteam(String[] arr) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+ 1;j<arr.length;j++) {
				count  =0;
				for(int k =0;k<arr[i].length();k++) {
					if(arr[i].charAt(k) == '0' && arr[j].charAt(k) == '0') {
						continue;
					}
					count++;
				}
				list.add(count);
			}
			
		}
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
        int max = sort.get(sort.size() - 1);
        int ans = (int) sort.stream().filter(i -> i == max).count();
        System.out.println(max + " " + ans);

	}

}
