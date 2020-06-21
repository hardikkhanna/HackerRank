package com.hackerrank.solutions;

public class AppendAndDelete {

	public static void main(String args[]) {
		String s = "hackerhappy";
		String t = "hackerrank";
		int k = 9;
		String ans = appendAndDelete(s, t, k);
		System.out.println(ans);
	}

	private static String appendAndDelete(String s, String t, int k) {/* Case 1 */
		String ans = "No";
		if (s.length() + t.length() <= k) {
			return "Yes";
		}

		/* Case 2 */
		int i = 0; // represents index of 1st non-matching character
		for (; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
		}
		int minOperations = (s.length() - i) + (t.length() - i);
		if (k >= minOperations && (k - minOperations) % 2 == 0) {
			ans = "Yes";
		}
		return ans;
	}

}
