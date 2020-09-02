package patternchallenges;

import java.util.Scanner;

public class mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsp = 2 * n - 3;
		while (r < n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print(cst + "\t");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			cst = nst;
			while (cst >= 1) {
				if (cst != n) {
					System.out.print(cst + "\t");
				}
				cst--;
			}

			System.out.println();
			r++;
			nst++;
			nsp -= 2;

		}
	}

}
