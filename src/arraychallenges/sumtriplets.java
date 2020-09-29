package arraychallenges;

import java.util.Scanner;

public class sumtriplets {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		sumtriplets(arr, target);

	}

}
