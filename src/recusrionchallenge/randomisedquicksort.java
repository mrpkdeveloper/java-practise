package recusrionchallenge;

import java.util.Scanner;

public class randomisedquicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		shufflearr(arr);
		randomisedsort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void shufflearr(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
//			int rand = (int) (Math.random() * range) + min;
			int j = (int) (Math.random() * i);
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}

	public static void randomisedsort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int p = partition(arr, lo, hi);
		randomisedsort(arr, lo, p - 1);
		randomisedsort(arr, p, hi);
	}

	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

}
