package challenges;

import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int flag = 0;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
