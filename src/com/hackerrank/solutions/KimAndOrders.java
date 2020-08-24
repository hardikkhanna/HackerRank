package com.hackerrank.solutions;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KimAndOrders {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[][] orders = new int[n][2];
		for (int i = 0; i < n; i++) {
			String[] ordersRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int ordersItem = Integer.parseInt(ordersRowItems[j]);
				orders[i][j] = ordersItem;
			}

			map.put(i + 1, orders[i][0] + orders[i][1]);
		}

		jimOrders(orders, map);
		scanner.close();
	}

	private static void jimOrders(int[][] orders, Map<Integer, Integer> map) {

		map = map.entrySet().stream().sorted(comparingByValue())
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		for (Integer key : map.keySet()) {
			System.out.print(key + " ");
		}
	}

}
