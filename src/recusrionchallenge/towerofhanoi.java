package recusrionchallenge;

import java.util.Scanner;

public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(toh(n, "T1", "T3", "T2"));

	}

	public static int toh(int n, String src, String help, String dest) {
		if (n == 0) {
			return 0;
		}
		int c = 1;
		c += toh(n - 1, src, dest, help);
		System.out.println("Move " + n + "th disc from " + src + " to " + dest);
		c += toh(n - 1, help, src, dest);
		return c;
	}

} 
