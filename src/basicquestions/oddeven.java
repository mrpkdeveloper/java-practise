package basicquestions;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int x = scn.nextInt();
		if (x % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
