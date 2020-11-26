package getrecursion;

import java.util.ArrayList;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutation("abc"));
		String s = "abc";
		System.out.println(s.length());

	}

	public static ArrayList<String> permutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add("");
			return blank;

		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> res = permutation(ros);
		ArrayList<String> ans = new ArrayList<String>();

		for (String resstring : res) {
			for (int i = 0; i <= resstring.length(); i++) {
				String val = resstring.substring(0, i) + ch + resstring.substring(i);
				ans.add(val);
			}
		}
		return ans;
	}

}
