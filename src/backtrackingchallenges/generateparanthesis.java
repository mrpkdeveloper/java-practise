package backtrackingchallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class generateparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		ArrayList<String> ans = gp(n, 0, 0);
//
//		for (int i = ans.size() - 1; i >= 0; i--) {
//			System.out.println(ans.get(i));
//		}
		gpprint(2, "", 0, 0);

	}

	public static ArrayList<String> gp(int n, int s, int e) {
		if (s == e && s == n) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}

		if (e > s) {
			ArrayList<String> blank = new ArrayList<>();
			return blank;
		}

		ArrayList<String> myres = new ArrayList<>();
		if (s < n) {
			ArrayList<String> res = gp(n, s + 1, e);
			for (String string : res) {
				myres.add("(" + string);
			}
		}
		if (e < n) {
			ArrayList<String> res = gp(n, s, e + 1);
			for (String string : res) {
				myres.add(")" + string);
			}
		}

		return myres;

	}

	public static void gpprint(int n, String ans, int s, int e) {
		if (s == e && s == n) {
			System.out.println(ans);
			return;
		}

		if (e > s) {
			return;
		}

		if (e < n && s != 0) {
			gpprint(n, ans + ")", s, e + 1);
		}
		if (s < n) {
			gpprint(n, ans + "(", s + 1, e);
		}

	}

}
