package patternchallenges;

import java.util.Scanner;

public class manmohanlovespattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, r = 0;
		while (r < n) {
			int cst = 1;
			while (cst <= nst) {
				if (nst % 2 != 0) {
					System.out.print("1");
				} else {
					if (cst == 1 || cst == nst) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				}
				cst++;
			}
			System.out.println();
			nst++;
			r++;
		}
	}

}
