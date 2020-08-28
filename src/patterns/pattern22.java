package patterns;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n, nsp = 0;
		while (r < n) {

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
				if (nst == 1) {
					nst--;
				}
				System.out.print("*");
				cst++;
			}

			System.out.println();
			r++;
			nst--;
			nsp += 2;

		}

	}

}
