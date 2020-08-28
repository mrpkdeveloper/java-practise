package patterns;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsp = n - 1;
		while (r < n) {
			int c = n - r;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				if (nst == 1 || cst == nst / 2 + 1) {
					System.out.print(0);
				} else {
					System.out.print(c);
					if (cst < nst / 2) {
						c++;
					} else if (cst > nst / 2 + 1) {
						c--;
					}

				}
				cst++;
			}

			System.out.println();
			r++;
			nst += 2;
			nsp--;
			c--;
		}

	}

}