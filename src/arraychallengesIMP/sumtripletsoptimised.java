package arraychallengesIMP;

import java.util.Scanner;

public class sumtripletsoptimised {

	// this is of order n^3
	public static void sumtriplets(int[] arr, int target) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int c = j + 1; c < arr.length; c++) {
					sum = arr[i] + arr[j] + arr[c];
					if (sum == target) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[c]);
					}
				}
			}
		}
	}

	public static void sumtripletsoptimised(int[] arr, int target) {
		for (int i = 0; i < arr.length-1; i++) {
			int l = i + 1, r = arr.length - 1, sum = 0;
			while (l < r) {
				sum = arr[i] + arr[l] + arr[r];
				if (sum == target) {
					System.out.println(arr[i] + ", " + arr[l] + " and " + arr[r]);
					l++;
					r--;
				} else if (sum > target) {
					r--;
				} else {
					l++;
				}
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
		insertionsort(arr);
		sumtripletsoptimised(arr, target);

	}

}
