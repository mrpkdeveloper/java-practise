package patternchallenges;

import java.util.Scanner;

public class manmohanpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 2, r = 1;
		System.out.println(1);
		while (r < n) {
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.print(nst - 1);
				} else {
					System.out.print("0");
				}

				cst++;
			}
			r++;
			System.out.println();
			nst++;

		}
	}

}
