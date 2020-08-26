package patterns;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n, nsp = n - 1, r = 0;
		while (r < 2 * n - 1) {

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
			r++;
			if (r < n) {
				nsp--;
				nst--;
			} else {
				nsp++;
				nst++;
			}

		}

	}

}
