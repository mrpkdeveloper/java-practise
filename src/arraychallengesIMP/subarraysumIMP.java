package arraychallengesIMP;

import java.util.Scanner;

public class subarraysumIMP {

// Order -> n^2	
	public static void subarraysumBRUTE(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum += arr[ei];
				if (sum > max) {
					max = sum;
				}
			}
//			System.out.println(max);
		}
		System.out.println(max);
	}

//	Order -> n
	public static void subarraysumoptimised(int[] arr) {
		int[] subarrsum = new int[arr.length];
		subarrsum[0] = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (subarrsum[i] + arr[i + 1] > arr[i + 1]) {
				subarrsum[i + 1] = subarrsum[i] + arr[i + 1];
			} else {
				subarrsum[i + 1] = arr[i + 1];
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < subarrsum.length; i++) {
			if (max < subarrsum[i]) {
				max = subarrsum[i];
			}
		}
		System.out.println(max);

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
			subarraysumoptimised(arr);
			t--;
		}

	}

}
