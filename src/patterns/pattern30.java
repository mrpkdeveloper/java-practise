package patterns;

import java.util.Scanner;

public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 0;
		while (r < n) {
			int c = n;
			while (c >= 1) {
				System.out.print(c);
				c--;
			}
			System.out.println();
			r++;
		}

	}

}
