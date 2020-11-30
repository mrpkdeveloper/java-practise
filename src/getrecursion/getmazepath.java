package getrecursion;

import java.util.ArrayList;

public class getmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0, 0, 2, 2));

	}

	public static ArrayList<String> mazepath(int cx, int cy, int fx, int fy) {

		if (cx == fx && cy == fy) {
			ArrayList<String> blank = new ArrayList<String>();
			blank.add("\n");
			return blank;
		}
		if (cx > fx || cy > fy) {
			ArrayList<String> blank = new ArrayList<String>();
			return blank;
		}
		ArrayList<String> hmove = mazepath(cx + 1, cy, fx, fy);
		ArrayList<String> ymove = mazepath(cx, cy + 1, fx, fy);
		ArrayList<String> ans = new ArrayList<String>();
		for (String res : hmove) {
			ans.add("H" + res);
		}
		for (String res : ymove) {
			ans.add("V" + res);
		}
		return ans;

	}

}
