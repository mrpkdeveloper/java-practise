package stringchallenges;

import java.util.Scanner;

public class stringcompression {

	public static void stringcompression(String s) {
		int c = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (c == 1) {
				System.out.print(s.charAt(i));
			}
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			} else {
				System.out.print(c);
				c = 1;
			}
		}
		if (c == 1) {
			System.out.println(s.charAt(s.length() - 1) + "" + c);
		} else {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		stringcompression(s);

	}

}
