package arraychallengesIMP;

import java.util.Scanner;

public class rainwaterharvestingIMP {

	public static void rainwaterharvestingBRUTE(int[] arr) {
		int l = 0, r = 0, water = 0, maxl = 0, maxr = 0;
		for (int i = 0; i < arr.length; i++) {
			l = r = i;
			maxl = maxr = arr[i];
			while (l >= 0) {
				if (maxl < arr[l]) {
					maxl = arr[l];
				}
				l--;
			}
			while (r < arr.length) {
				if (maxr < arr[r]) {
					maxr = arr[r];
				}
				r++;
			}

			water += Math.min(maxl, maxr) - arr[i];
//			System.out.println(arr[i] + " - " + water + "(" + maxl + " - " + maxr + ")");

		}
		System.out.println(water);

	}

	public static void rainwaterharvestingoptimised(int[] arr) {
		int water = 0;
		int[] arrl = new int[arr.length];
		int[] arrr = new int[arr.length];
		arrl[0] = arr[0];
		arrr[arr.length - 1] = arr[arr.length - 1];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arrl[i - 1]) {
				arrl[i] = arr[i];
			} else {
				arrl[i] = arrl[i - 1];
			}

		}
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arrr[i + 1]) {
				arrr[i] = arr[i];
			} else {
				arrr[i] = arrr[i + 1];
			}

		}

		for (int i = 0; i < arrr.length; i++) {
			System.out.println(arrl[i] + " - " + arrr[i]);
		}

		for (int i = 0; i < arrr.length; i++) {
			water += Math.min(arrl[i], arrr[i]) - arr[i];
		}
		System.out.println(water);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
//		rainwaterharvestingBRUTE(arr);
		rainwaterharvestingoptimised(arr);

	}

}
