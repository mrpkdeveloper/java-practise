package challenges;

import java.util.Scanner;

public class delhioddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n > 0) {
			int cn = scn.nextInt();
			int c = 1, es = 0, os = 0;
			while (cn > 0) {
				c = cn % 10;
				cn = cn / 10;
				if (c % 2 == 0) {
					es += c;
				} else {
					os += c;
				}
			}
			if (os % 3 == 0 || es % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n--;
		}
	}

}
