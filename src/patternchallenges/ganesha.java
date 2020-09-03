package patternchallenges;

import java.util.Scanner;

public class ganesha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nsp = n / 2 - 1, nsts = 1, nste = n / 2 + 1, nsps = 0;
		while (r < n) {

			int csp = 1;
			while (csp <= nsps) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nsts) {
				System.out.print("*");
				cst++;
			}

			csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			cst = 1;
			while (cst <= nste) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			r++;
			nste = 1;
			if (r == n / 2) {
				nsp = 0;
				nsts = n / 2;
				nste = n / 2 + 1;
			} else if (r == n - 1) {
				nsts = n / 2 + 1;
				nsp = n / 2 - 1;
				nste = 1;
				nsps = 0;
			} else if (r > n / 2 && r < n - 1) {
				nsps = n / 2;
				nsts = 1;
				nsp = n / 2 - 1;
			}

		}

	}

}
