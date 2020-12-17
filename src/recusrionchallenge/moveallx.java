package recusrionchallenge;

import java.util.Scanner;

public class moveallx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		moveallx(str, "", "");
		System.out.println(moveallx(str));

	}

	public static void moveallx(String ques, String ans, String ansx) {
		if (ques.length() == 1) {
			System.out.println(ans + ques + ansx);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		if (ch == 'x') {
			moveallx(ros, ans, ansx + ch);
		} else {
			moveallx(ros, ans + ch, ansx);
		}
	}

	// better approach
	public static String moveallx(String ques) {
		if (ques.length() == 0) {
			return ques;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		if (ch == 'x') {
			return moveallx(ros) + ch;
		} else {
			return ch + moveallx(ros);
		}

	}

}
