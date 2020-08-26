package patterns;

import java.util.Scanner;

public class pattern7imp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n, nsp = 0;
		while (r < n) {
			if (r == 0 || r == n - 1) {
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}
			} else {
				int cst = 1;
				while (cst <= nst) {
					if (cst == 1 || cst == nst) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					cst++;
				}
			}

			System.out.println();
			r++;

		}

	}

}
