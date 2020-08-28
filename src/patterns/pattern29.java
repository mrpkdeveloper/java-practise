package patterns;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsp = n - 1;
		while (r < n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst && nst != 1) {
					System.out.print(r + 1);
				} else {
					System.out.print(0);
				}
				cst++;
			}

			System.out.println();
			r++;
			nst += 2;
			nsp--;

		}

	}

}
