package patterns;

import java.util.Scanner;

public class pattern8imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 2, nsps = 0, nspe = n - 2;
		while (r < n) {

			int csps = 1;
			while (csps <= nsps) {
				System.out.print(" ");
				csps++;
			}

			int cst = 1;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}

			int csp = 1;
			while (csp <= nspe) {
				System.out.print(" ");
				csp++;
			}

			while (cst == nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			r++;
			// for r=1
			if (r < n / 2) {
				nsps++;
				nspe -= 2;
			} else if (r == n / 2) {
				nst = 1;
				nsps++;
				nspe -= 2;
			} else {
				nst = 2;
				nsps--;
				nspe += 2;
			}

		}

	}

}
