package arraychallengesIMP;

import java.util.Scanner;

public class chewbacca {

	public static void invert(long n) {
		long newno = 0;
		int nod = 0;
		while (n > 0) {
			long rem = n % 10;
			n = n / 10;
			if (n == 0 && rem == 9 || rem <= 4) {
				rem = rem;
			} else if (rem > 4) {
				rem = 9 - rem;
			}
			newno += rem * Math.pow(10, nod);
			nod++;
		}
		System.out.println(newno);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		invert(n);

	}

}
