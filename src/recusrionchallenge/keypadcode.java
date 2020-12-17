package recusrionchallenge;

import java.util.Scanner;

public class keypadcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = "" + n;
		keypad(str, "");
		System.out.println();
		System.out.println(keypadcount(str, ""));

	}

	public static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static int keypadcount(String s1, String ans) {
		if (s1.length() == 0) {
			return 1;
		}
		int c = 0;
		char ch = s1.charAt(0);
		String ros = s1.substring(1);
		String code = arr[ch - '0'];

		for (int i = 0; i < code.length(); i++) {
			c += keypadcount(ros, ans + code.charAt(i));
		}
		return c;

	}

	public static void keypad(String s1, String ans) {
		if (s1.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = s1.charAt(0);
		String ros = s1.substring(1);
		String code = arr[ch - '0'];

		for (int i = 0; i < code.length(); i++) {
			keypad(ros, ans + code.charAt(i));
		}

	}

}
