package patternchallenges;

import java.util.Scanner;

public class fibonaccipattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, c = 0, ne = 1;
		while (n > 0) {
			int ce = 1;
			while (ce <= ne) {
				System.out.print(a + "\t");
				c = a + b;
				a = b;
				b = c;
				ce++;
			}
			System.out.println();
			n--;
			ne++;
		}
	}

}
