package recusrionchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class subsequencelexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n > 0) {
			String str = scn.next();
			ArrayList<String> ans = allSub(str);
			for (int i = 0; i < ans.size(); i++) {
				System.out.println(ans.get(i));
			}
			n--;
		}

	}

	public static ArrayList<String> allSub(String str) {

		ArrayList<String> rr = sub(str);

		Collections.sort(rr);
		return rr;

	}

	public static ArrayList<String> sub(String str) {
		if (str.length() == 0) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add("");
			return blank;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> res = sub(ros);
		ArrayList<String> ans = new ArrayList<String>();
		for (String restring : res) {
			ans.add(restring);
			ans.add(ch + restring);
		}
		return ans;

	}

}
