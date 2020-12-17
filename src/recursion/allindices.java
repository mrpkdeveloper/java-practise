package recursion;

import java.util.Scanner;

public class allindices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		allindices(arr, m, 0);
	}

	public static void allindices(int[] arr, int m, int vid) {
		if (vid == arr.length) {
			return;
		}
		if (arr[vid] == m) {
			System.out.print(vid + " ");
		}
		allindices(arr, m, vid + 1);

	}

}
