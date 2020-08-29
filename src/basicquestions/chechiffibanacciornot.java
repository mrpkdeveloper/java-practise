package basicquestions;

import java.util.Scanner;

public class chechiffibanacciornot {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, c = 0;
		while (a <= n) {
			if (a == n) {
				System.out.println("fibonacci number");
				break;
			}
			c = a + b;
			a = b;
			b = c;
		}
		if (a != n) {
			System.out.println("not a fibonacii number");
		}
	}
}
