package challenges;

import java.util.Scanner;

public class simpleinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		while (sum >= 0) {
			int n = scn.nextInt();
			sum += n;
			if (sum >= 0) {
				System.out.println(n);
			}

		}
	}

}
