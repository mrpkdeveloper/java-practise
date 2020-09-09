package patternchallenges;

import java.util.Scanner;

public class hollowrohmbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nsps = n - 1, nst = n, nsp = n - 2;
		while (r < n) {
			int csps = 1;
			while (csps <= nsps) {
				System.out.print(" ");
				csps++;
			}
			if (r == 0 || r == n - 1) {
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}
			} else {
				System.out.print("*");
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;
				}
				System.out.print("*");

			}

			System.out.println();
			r++;
			nsps--;

		}

	}

}
