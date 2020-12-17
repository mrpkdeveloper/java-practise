package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dictionaryordersmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String orig = new String(str);

		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);

		dictorderprint(orig, str, "");

	}

	// optimised--------------
	public static void dictorderprint(String og, String str, String ans) {
		if (str.length() == 0) {
			if (ans.compareTo(og) < 0)
				System.out.println(ans);
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			dictorderprint(og, ros, ans + ch);

		}

	}

}
