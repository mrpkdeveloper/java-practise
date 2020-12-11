package recusrionchallenge;

import java.util.Scanner;

public class smartkeypad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(check("vidhi", "dh"));
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		keypad1(str, "");

	}

	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	static String searchIn[] = { "prateek", "sneha", "deepak", "arnav", "shikha", "palak", "utkarsh", "divyam", "vidhi",
			"sparsh", "akku" };

	public static void keypad1(String ques, String ans) {

		if (ques.length() == 0) {
//			System.out.println(ans);
			for (String ss : searchIn) {
				if (check(ss, ans)) {
					System.out.println(ss);
				}
			}
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		// for converting char to int
		String code = table[ch - '0'];

		for (int i = 0; i < code.length(); i++)
			keypad1(ros, ans + code.charAt(i));

	}

	public static boolean check(String s1, String s2) {
		int i = 0, j = 0, flag = 0;
		while (i < s1.length() && j < s2.length()) {

			if (flag == 0) {
				if (s1.charAt(i) != s2.charAt(j)) {
//					System.out.println(s1.charAt(i));
					i++;
				} else {
//					System.out.println(s1.charAt(i));
					j++;
					i++;
					flag = 1;
				}
			} else {
				if (s1.charAt(i) == s2.charAt(j)) {
//					System.out.println(s1.charAt(i));
					j++;
					i++;
				} else {
					j = 0;
					flag = 0;
				}
			}

		}
		if (j == s2.length()) {
			return true;
		} else {
			return false;
		}

	}

}
