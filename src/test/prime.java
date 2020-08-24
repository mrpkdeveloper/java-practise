package test;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int flag = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
				System.out.println("non-prime");
				break;

			}
		}
		if (flag == 0) {
			System.out.println("prime");
		}
	}
}
