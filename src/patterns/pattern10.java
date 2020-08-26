package patterns;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = n * 2 - 1, nsp = 0;
		while (r < n) {

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
			nst -= 2;
			nsp++;

		}
	}

}
