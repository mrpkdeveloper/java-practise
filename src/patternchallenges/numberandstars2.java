package patternchallenges;

import java.util.Scanner;

public class numberandstars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n - 1, r = 1;
		while (r <= n) {
			int csn = 1;
			while (csn <= r) {
				System.out.print(csn);
				csn++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			r++;
			nst--;

		}
	}

}
