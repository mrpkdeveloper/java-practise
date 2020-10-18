package arraychallengesIMP;

import java.util.Scanner;

public class largefactorial {

	public static void largefact(int n) {
		int[] arr = new int[100000];
		arr[0] = 1;
		int nod = 1;
		int carry = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < nod; j++) {
				int a = i * arr[j] + carry;
				arr[j] = a % 10;
				carry = a / 10;
			}
			while (carry > 0) {
				arr[nod] = carry % 10;
				carry = carry / 10;
				nod++;
			}

		}
		for (int i = nod - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		largefact(n);

	}

}
