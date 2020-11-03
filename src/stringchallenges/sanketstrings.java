package stringchallenges;

import java.util.Scanner;

import arraychallengesIMP.max;

public class sanketstrings {

	public static int maxsublength(String s, int n, char ch) {
		int l = 0, r = 0, c = 0, ans = 0;
		for (r = 0; r < s.length(); r++) {
			if (s.charAt(r) != ch) {
				c++;
			}
			if (c == n) {
				break;
			}
		}
		while (l < r) {
			while (r < s.length() - 1 && s.charAt(r + 1) == ch) {
				r++;
			}
			int curlength = r - l + 1;
			ans = Math.max(ans, curlength);
			l++;
			if (s.charAt(l - 1) != ch && r < s.length() - 1) {
				r++;
			}
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
		int ansa = maxsublength(s, n, 'a');
		int ansb = maxsublength(s, n, 'b');
		System.out.println(Math.max(ansa, ansb));

	}

}
