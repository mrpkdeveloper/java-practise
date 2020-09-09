package patternchallenges;

import java.util.Scanner;

public class pascalstriangleIMP {

	public static int fact(int n) {
		int a = 1;
		while (n > 0) {
			a *= n;
			n--;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0, nst = 1, nsp = 2 * n + 3;
		while (r < n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst < nst) {
				int a = (fact(r) / (fact(r - cst) * fact(cst)));
				System.out.print(a + "   ");
				cst++;
			}

			System.out.println();
			r++;
			nsp -= 2;
			nst++;

		}
	}

}
