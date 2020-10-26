package arraychallengesIMP;

import java.util.Scanner;

public class twoarraysum {

	public static void sum(int[] a, int[] b) {
		int[] sum = new int[Math.max(a.length, b.length)];
		int c = 0;
		int i = a.length - 1, j = b.length - 1, k = sum.length - 1;
		while (k >= 0) {
			if (i >= 0 && j >= 0) {
				sum[k] = (a[i] + b[j] + c) % 10;
				c = (a[i] + b[j] + c) / 10;
			} else if (i < 0) {
				sum[k] = (b[j] + c) % 10;
				c = (b[j] + c) / 10;
			} else {
				sum[k] = (a[i] + c) % 10;
				c = (a[i] + c) / 10;

			}
			k--;
			i--;
			j--;
		}
		if (c > 0) {
			System.out.print(c + ", ");
		}
		for (int k2 = 0; k2 < sum.length; k2++) {
			System.out.print(sum[k2] + ", ");
		}
		System.out.print("END");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scn.nextInt();
		}
		int m = scn.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < b.length; i++) {
			b[i]=scn.nextInt();
		}
		sum(a, b);

	}

}
