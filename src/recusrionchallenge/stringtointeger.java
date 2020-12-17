package recusrionchallenge;

import java.util.Scanner;

public class stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(sti(str));

	}

	public static int sti(String str) {
		if (str.length() == 0) {
			return 0;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		int pow = ros.length();
		return (ch - '0') * (int) Math.pow(10, pow) + sti(ros);

	}
}
