package recusrionchallenge;

import java.util.Scanner;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] ans = mergesort(arr, arr.length - 1, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] mergesort(int[] arr, int hi, int lo) {
		if (lo == hi) {
			int[] base = new int[1];
			base[0] = arr[lo];
			return base;
		}

		int mid = (lo + hi) / 2;

		int[] marr1 = mergesort(arr, mid, lo);
		int[] marr2 = mergesort(arr, hi, mid + 1);

		int[] ans = mergerarr(marr1, marr2);
		return ans;

	}

	public static int[] mergerarr(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] ans = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (i == arr1.length) {
			while (j != arr2.length) {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		} else {
			while (i != arr1.length) {
				ans[k] = arr1[i];
				i++;
				k++;
			}
		}

		return ans;
	}

}
