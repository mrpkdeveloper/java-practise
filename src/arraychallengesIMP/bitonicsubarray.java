package arraychallengesIMP;

import java.util.Scanner;

public class bitonicsubarray {

	public static void bitonicsubarray(int[] arr) {
		int[] inclr = new int[arr.length];
		int[] incrl = new int[arr.length];
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = 0;
		int c = 0, c2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
				c++;
				inclr[i] = c;
			} else {
				c = 1;
				inclr[i] = c;
				max = arr[i];
			}

			if (max2 <= arr[arr.length - 1 - i]) {
				max2 = arr[arr.length - 1 - i];
				c2++;
				incrl[arr.length - 1 - i] = c2;
			} else {
				c2 = 1;
				incrl[arr.length - 1 - i] = c2;
				max2 = arr[arr.length - 1 - i];
			}
		}

		for (int i = 0; i < incrl.length; i++) {
			if (max3 <= (incrl[i] + inclr[i] - 1)) {
				max3 = (incrl[i] + inclr[i] - 1);
			}
		}
		System.out.println(max3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int m = scn.nextInt();
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			bitonicsubarray(arr);
			t--;
		}

	}

}
