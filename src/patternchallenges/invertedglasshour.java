package patternchallenges;

import java.util.Scanner;

public class invertedglasshour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, r = 1, nsp = 4 * n - 2;
		while (r <= 2 * n + 1) {
			int c = n;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(c + " ");
				cst++;
				c--;
			}
			c++;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			cst = 1;
			while (cst <= nst) {
				if (c != 0) {
					System.out.print(c + " ");
				}
				cst++;
				c++;
			}

			System.out.println();
			r++;
			if (r <= n + 1) {
				nsp -= 4;
				nst++;
			} else {
				nsp += 4;
				nst--;
			}

		}
	}

}
