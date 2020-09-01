package challenges;

import java.util.Scanner;

public class incresingdecreasingIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int big = Integer.MAX_VALUE;
		int flag = 0;

		// first check for decreasing
		while (n > 0) {
			int a = scn.nextInt();
			if (a < big) {
				big = a;
			} else {
				n--;
				break;
			}
			n--;
		}

		// then check for increasing
		while (n > 0) {
			int a = scn.nextInt();
			if (a > big) {
				big = a;
			} else {
				flag = 1;
				n--;
				break;
			}
			n--;
		}
		if (flag == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
