package challenges;

import java.util.Scanner;

public class armstrongnumber {

	public static boolean armstrong(int n) {
		int d = digits(n);
		int sum = sum(n, d);
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static int digits(int n) {
		int digits = 0;
		while (n > 0) {
			n = n / 10;
			digits++;
		}
		return digits;
	}

	public static int sum(int n, int d) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, d);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int on = scn.nextInt();
		System.out.println(armstrong(on));

	}

}
