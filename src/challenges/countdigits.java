package challenges;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int c = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem == d) {
				c++;
			}
		}
		System.out.println(c);
	}

}
