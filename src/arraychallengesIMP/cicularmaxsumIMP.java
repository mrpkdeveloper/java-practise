package arraychallengesIMP;

import java.util.Scanner;

public class cicularmaxsumIMP {

	public static void circularmaxsumBRUTE(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < arr.length; si++) {
			int ei = si, sum = 0;
			int c = arr.length;
			while (c > 0) {
				ei = ei % arr.length;
				sum += arr[ei];
				if (sum > max) {
					max = sum;
				}
				ei++;
				c--;
			}
		}
		System.out.println(max);
	}

	public static void circularmaxsumoptimised(int[] arr) {
		int minsofar = Integer.MAX_VALUE, minending = 0, arrsum = 0, flag = 0;
		int maxelement = Integer.MIN_VALUE;
		int maxsofar = Integer.MIN_VALUE, maxending = 0;
		for (int i = 0; i < arr.length; i++) {
//			check for all values -ve
			if (arr[i] > 0) {
				flag = 1;
			}

//			check for min element
			if (maxelement < arr[i]) {
				maxelement = arr[i];
			}

			arrsum += arr[i];
			minending = minending + arr[i];
			if (minsofar > minending) {
				minsofar = minending;
			}
			if (minending > 0) {
				minending = 0;
			}

//			kadanes algo if no wrap around max sum
//			maxending = maxending + arr[i];
//			if (maxsofar < maxending) {
//				maxsofar = maxending;
//			}
//			if (maxending < 0) {
//				maxending = 0;
//			}

		}
		if (flag == 1) {
			System.out.println(Math.max(arrsum - minsofar, maxsofar));
		} else {
			System.out.println(maxelement);
		}
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
//			circularmaxsumBRUTE(arr);
			circularmaxsumoptimised(arr);
			t--;
		}

	}

}
