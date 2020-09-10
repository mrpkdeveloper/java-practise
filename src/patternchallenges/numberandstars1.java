package patternchallenges;

import java.util.Scanner;

public class numberandstars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = -1;
		while (n > 0) {
			int csn = 1;
			while (csn <= n) {
				System.out.print(csn + " ");
				csn++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			n--;
			nst += 2;

		}
	}

}
