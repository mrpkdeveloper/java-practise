package arraychallengesIMP;

import java.util.Scanner;

public class medianarray {

	public static void median(int[] a, int[] b) {
		int i = 0, j = 0, c = a.length, med = 0;
		while (c > 0) {
			if (a[i] < b[j]) {
				med = a[i];
				i++;
				c--;
			} else {
				med = b[j];
				j++;
				c--;
			}
		}
		System.out.println(med);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = scn.nextInt();
		}
		median(a, b);

	}

}
