package patternchallenges;

import java.util.Scanner;

public class patternwithzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, r = 1;
		while (r <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.print(nst + "\t");
				} else {
					System.out.print("0" + "\t");
				}

				cst++;
			}
			r++;
			System.out.println();
			nst++;

		}
	}

}
