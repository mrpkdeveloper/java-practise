package patterns;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n, nsp = 0;
		while (r < n) {

			// work

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst--;
			nsp += 2;
			r++;
		}

	}

}
