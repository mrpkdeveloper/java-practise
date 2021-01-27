package backtrackingchallenges;

import java.util.Arrays;
import java.util.Scanner;

public class sumtarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 10, 1, 2, 1, 3, 7, 6, 1, 5 };
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int t = scn.nextInt();
		Arrays.sort(arr);
		sumtarget(arr, t, 0, "", 0);

	}

	public static void sumtarget(int[] arr, int target, int sum, String ans, int liu) {
		if (sum == target) {
			System.out.println(ans);
			return;
		}
		if (sum > target) {
			return;
		}

		for (int j = liu; j < arr.length; j++) {

			sumtarget(arr, target, sum + arr[j], ans + arr[j] + " ", j + 1);

			int a = arr[j];
			if (j + 1 < arr.length && a == arr[j + 1]) {
				j = j + 1;
			}

		}
	}

}
