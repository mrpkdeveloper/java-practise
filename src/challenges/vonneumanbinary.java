package challenges;

import java.util.Scanner;

public class vonneumanbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		short n = scn.nextShort();
		while (n > 0) {
			long bin = scn.nextLong();
			int dec = 0;
			int p = 0;
			while (bin > 0) {
				dec += (bin % 10) * (int) (Math.pow(2, p));
				bin = bin / 10;
				p++;

			}
			System.out.println(dec);
			n--;
		}

	}

}
