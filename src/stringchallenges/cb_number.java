package stringchallenges;

import java.util.Scanner;

public class cb_number {

	public static boolean checkcbnumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		System.out.println(n);
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int Strlength = scn.nextInt();
		String s = null;
		while (s == null || s.length() != Strlength) {
			s = scn.next();
			int max = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j <= s.length(); j++) {
					int n = Integer.parseInt(s.substring(i, j));
					if (checkcbnumber(n)) {
						max++;
					}

				}
			}
			System.out.println(max);
		}
	}
}
