package patternchallenges;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, r = 1, nsp = n - 1;
		while (r <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			int cst = 1;
			int c = r;
			while (cst <= nst) {
				System.out.print(c + "\t");
				if (cst <= nst / 2) {
					c++;
				} else {
					c--;
				}
				cst++;
			}

			r++;
			System.out.println();
			nst += 2;
			nsp--;

		}
	}

}
