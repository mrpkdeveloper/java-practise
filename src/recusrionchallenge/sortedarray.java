package recusrionchallenge;

import java.util.Scanner;

import basicquestions.chechiffibanacciornot;

public class sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(checksorted(arr, 0));

	}

	public static boolean checksorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		boolean ans = true;
		if (checksorted(arr, i + 1)) {
			if (arr[i] <= arr[i + 1]) {
				ans = true;
			} else {
				ans = false;
			}
		} else {
			ans = false;
		}
		return ans;

	}

}
