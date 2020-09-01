package challenges;

import java.util.Scanner;

public class pythagoreantriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long a = 0, b = 0;
		if (n % 2 == 0) {
			long m = n / 2;
			a = m * m - 1;
			b = m * m + 1;

		} else {
			long m1 = (n + 1) / 2;
			long m2 = (n - 1) / 2;

			a = 2 * m1 * m2;
			b = m1 * m1 + m2 * m2;
		}

		if (a > 0 && b > 0) {
			System.out.println(a + " " + b);
		} else {
			System.out.println("-1");
		}
	}

}
