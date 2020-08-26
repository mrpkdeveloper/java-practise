package patterns;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n / 2, nsp = 1;
		while (r < n - 2) {
			if (r == 0) {
				int cst = 1;
				while (cst <= n) {
					System.out.print("*");
					cst++;
				}
				System.out.println();
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			r++;
			if (r < n / 2) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}

			if (r == n - 2) {
				cst = 1;
				while (cst <= n) {
					System.out.print("*");
					cst++;
				}
				System.out.println();
			}
		}

	}

}
