package recusrionchallenge;

import java.util.Scanner;

public class duplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		dc(str, "");

	}

	public static void dc(String ques, String ans) {
		if (ques.length() == 1) {
			System.out.println(ans + ques);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		if (ch == ros.charAt(0)) {
			dc(ros, ans + ch + "*");
		} else {
			dc(ros, ans + ch);
		}

	}

}
