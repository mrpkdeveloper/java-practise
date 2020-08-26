package patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsps = n - 1, nspe = 1;
		while (r < n) {

			int csps = 1;
			while (csps <= nsps) {
				System.out.print(" ");
				csps++;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("!");
				} else {
					System.out.print("*");
				}
				cst++;
			}

			System.out.println();
			r++;
			nsps--;
			nst += 2;

		}
	}

}
