package challenges;

import java.util.Scanner;

public class quadraticequations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int r1 = 0, r2 = 0, D = 0;
		D = b * b - 4 * a * c;
		System.out.println((int) (Math.sqrt(D)));
		if (D > 0) {
			System.out.println("Real and Distinct");
			r1 = (int) ((-b + Math.sqrt(D)) / (2 * a));
			r2 = (int) ((-b - Math.sqrt(D)) / (2 * a));
			System.out.println(r2 + " " + r1);
		} else if (D == 0) {
			System.out.println("Real and Equal");
			r1 = (int) (-b / (2 * a));
			System.out.println(r1 + " " + r1);
		} else {
			System.out.println("Imaginary");
		}

	}

}