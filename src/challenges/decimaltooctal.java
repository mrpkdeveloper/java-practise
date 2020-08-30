package challenges;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int dec = scn.nextInt();
		int oct = 0;
		int p = 0;
		while (dec > 0) {
			oct += (dec % 8) * (int) (Math.pow(10, p));
			dec = dec / 8;
			p++;

		}
		System.out.println(oct);
	}

}
