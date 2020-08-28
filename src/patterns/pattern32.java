package patterns;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, c = 1;
		while (r < 2 * n - 1) {

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(c);
				}
				cst++;
			}

			System.out.println();
			r++;
			if (r < n) {
				nst += 2;
				c++;
			} else {
				nst -= 2;
				c--;
			}
		}

	}

}