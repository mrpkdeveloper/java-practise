package getrecursion;

import java.util.ArrayList;

public class subsequence {

	public static ArrayList<String> subsequence(String str) {
		if (str.length() == 0) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add(" ");
			return blank;
		}

		char ch = str.charAt(0);
		String substr = str.substring(1);
		ArrayList<String> res = subsequence(substr);
		ArrayList<String> finalstr = new ArrayList<String>();
		for (int i = 0; i < res.size(); i++) {
			finalstr.add(res.get(i));
			finalstr.add(ch + res.get(i));
		}
		return finalstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsequence("abc"));

	}

}
