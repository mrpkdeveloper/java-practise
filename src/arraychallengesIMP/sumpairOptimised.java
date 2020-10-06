package arraychallengesIMP;

import java.util.Scanner;

public class sumpairOptimised {

	public static void sumpair(int[] arr, int target) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == target) {
					if (arr[i] < arr[j])
						System.out.println(arr[i] + " and " + arr[j]);
					else
						System.out.println(arr[j] + " and " + arr[i]);
				}
			}
		}

	}

	// for optimised solution we have to sort the array
	public static void sumpairoptimised(int[] arr, int target) {
		int sum = 0;
		int l = 0, r = arr.length - 1;
		while (l < r) {
			sum = arr[l] + arr[r];
			if (sum == target) {
				System.out.println(arr[l] + " and " + arr[r]);
				l++;
				r--;
			} else if (sum > target) {
				r--;
			} else {
				l++;
			}
		}

	}

	public static void insertionsort(int[] arr) {
		for (int c = 1; c < arr.length; c++) {
			int val = arr[c];
			int j;
			for (j = c - 1; j >= 0; j--) {
				if (arr[j] > val) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
//		sumpair(arr, target);
		insertionsort(arr);

		sumpairoptimised(arr, target);

	}

}
