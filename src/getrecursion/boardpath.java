package getrecursion;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boardpath(0, 10));

	}

	public static ArrayList<String> boardpath(int start, int end) {
		// positive base case
		if (start == end) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add("\n");
			return blank;
		}

		// negative base case
		if (start > end) {
			ArrayList<String> blank = new ArrayList<String>();
			return blank;
		}

		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 1; i <= 6; i++) {
			ArrayList<String> res = boardpath(start + i, end);
			for (String resstring : res) {
				String val = i + resstring;
				ans.add(val);
			}
		}
		return ans;
	}

}
