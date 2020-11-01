package stringchallenges;

import arraychallengesIMP.max;

public class sanketstrings {

	public static void maxsublength(String s, int n, char ch) {
		int l = 0, r = 0, c = 0, ans = 0;
		while (r < s.length()) {
			if (s.charAt(r) != ch && c < n) {
				c++;
			}

			if (c == n) {
				break;
			}
			r++;
		}
		ans = r - l;
		System.out.println(ans);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbaab";
		maxsublength(s, 2, 'a');

	}

}
