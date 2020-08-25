package test;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int sum = 0;
		while (n != 0) {
			sum = sum * 10 + n % 10;
			n = n / 10;

		}
		System.out.println(sum);
	}

}
