package basicquestions;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two numbers");
		int D = scn.nextInt();
		int d = scn.nextInt();
		int r = D % d;
		while (r != 0) {
			D = d;
			d = r;
			r = D % d;
		}
		System.out.println("gcd is " + d);
	}

}
