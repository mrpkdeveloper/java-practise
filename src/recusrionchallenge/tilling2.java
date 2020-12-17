package recusrionchallenge;

import java.util.Scanner;

public class tilling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
//			long ans = tilling2(n, m);
			long ans = tilling2DP(n, m);
			System.out.println(ans);
			t--;
		}

//		System.out.println(tilling2(8, 3));

	}

	// TLE (giving error)
	public static long tilling2(int n, int m) {
		if (n < m) {
			return 1;
		}

		if (n == m) {
			return 2;
		}

		// vertical placed //horizontal call
		long myans = (tilling2(n - m, m) + tilling2(n - 1, m)) % (long) (Math.pow(10, 9) + 7);
		return myans;
	}

	// with dp
	public static long tilling2DP(int n, int m) {
		long[] dp = new long[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i < m) {
				dp[i] = 1;
			} else if (i == m) {
				dp[i] = 2;
			} else {
				dp[i] = (dp[i - 1] + dp[i - m]) % (long) (Math.pow(10, 9) + 7);
			}
		}

		return dp[n];

	}

}
