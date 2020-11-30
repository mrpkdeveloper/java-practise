package recusrionchallenge;

import java.util.Scanner;

public class replacepi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(replacepi("xpipippixx"));
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n > 0) {
			String str = scn.next();
			System.out.println(replacepi(str));
			n--;
		}

	}

	public static String replacepi(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String ans = "";
		char ch1 = str.charAt(0);
		String ros = str.substring(1);
		if (ch1 == 'p' && ros.charAt(0) == 'i') {
			ans = "3.14" + replacepi(ros.substring(1));
		} else {
			ans = ch1 + replacepi(ros);
		}

		return ans;

	}

}
