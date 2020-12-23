package backtrackingchallenges;

import java.util.Arrays;
import java.util.Scanner;

public class trickypermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char[] strarr = str.toCharArray();
		Arrays.sort(strarr);
		String finalstr = new String(strarr);
		tp(finalstr, "");

	}

	public static void tp(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			boolean flag = true;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					flag = false;
				}
			}

			if (flag) {
				tp(ros, ans + ch);
			}
		}

	}

}
