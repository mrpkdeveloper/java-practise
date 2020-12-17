package recusrionchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class dictionaryorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String orig = new String(str);

		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);

		dictorderprint(orig, str, "");
//		ArrayList<String> res = dictorder(str);
//		Collections.sort(res);
//		System.out.println(res);
//		for (String rr : res) {
//			if (rr.compareTo(str) > 0) {
//				System.out.println(rr);
//			}
//		}

	}

	public static ArrayList<String> dictorder(String str) {
		if (str.length() == 0) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add("");
			return blank;
		}
		ArrayList<String> mr = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			ArrayList<String> rr = dictorder(ros);
			for (String res : rr) {
				mr.add(res + ch);
			}
		}
		return mr;

	}

	// optimised--------------
	public static void dictorderprint(String og, String str, String ans) {
		if (str.length() == 0) {
			if (ans.compareTo(og) > 0)
				System.out.println(ans);
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			dictorderprint(og, ros, ans + ch);

		}

	}

}
