package patternchallenges;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n / 2, nsp = 1;
		while (r < n) {
			int cst = 1;
			if (r == 0 || r == n - 1) {
				while (cst <= n) {
					System.out.print("*\t");
					cst++;
				}
			} else {
				cst = 1;
				while (cst <= nst) {
					System.out.print("*\t");
					cst++;
				}
				int csp = 1;
				while (csp <= nsp) {
					System.out.print("\t");
					csp++;
				}
				cst = 1;
				while (cst <= nst) {
					System.out.print("*\t");
					cst++;
				}

			}

			System.out.println();
			r++;
			if (r > 1 && r <= n / 2) {
				nst--;
				nsp += 2;
			} else if (r > n / 2) {
				nst++;
				nsp -= 2;
			}
		}
	}

}
