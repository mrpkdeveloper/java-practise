package patterns;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsp = n / 2;
		while (r < n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				cst++;
			}

			System.out.println();
			r++;
			if (r <= n / 2) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}

		}

	}

}
