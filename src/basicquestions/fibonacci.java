package basicquestions;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c;
//		System.out.println(a);
//		System.out.println(b);
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

}
