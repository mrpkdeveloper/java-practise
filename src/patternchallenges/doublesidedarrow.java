package patternchallenges;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 2, r = 1, nsp = 2 * n - 2, nspe = 2;
		if (n == 1) {
			System.out.println(1);
		} else {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			System.out.println("1");
			nsp -= 4;

			while (r <= n - 2) {
				csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;
				}

				int cst = 1, c = nst;
				while (cst <= nst) {
					System.out.print(c + " ");
					cst++;
					c--;
				}

				int cspe = 1;
				while (cspe <= nspe) {
					System.out.print(" ");
					cspe++;
				}

				cst = 1;
				c = 1;
				while (cst <= nst) {
					System.out.print(c + " ");
					cst++;
					c++;
				}

				r++;
				System.out.println();
				if (r <= n / 2) {
					nst++;
					nsp -= 4;
					nspe += 4;
				} else {
					nst--;
					nsp += 4;
					nspe -= 4;
				}

			}

			csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			System.out.print("1");
		}

	}

}
