package challenges;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int newnum = 0;
		while (n >0) {
			newnum = newnum * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(newnum);
	}

}
