package patterns;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1;
		while (r < n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			r++;
		}

	}

}
