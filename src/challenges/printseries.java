package challenges;

import java.util.Scanner;

public class printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		byte n1 = scn.nextByte();
		byte n2 = scn.nextByte();
		byte n = 1;
		while (n1 > 0) {
			if ((3 * n + 2) % n2 != 0) {
				System.out.println(3 * n + 2);
				n1--;
			}
			n++;
		}

	}

}
