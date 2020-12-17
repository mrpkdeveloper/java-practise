package recusrionchallenge;

import java.util.Scanner;

public class IMPoptimalgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(game(arr, 0, arr.length - 1));

	}

	public static int game(int[] arr, int i, int j) {
		if (i > j) {
			return 0;
		}

		int sumi = arr[i] + Math.min(game(arr, i + 2, j), game(arr, i + 1, j - 1));
		int sumj = arr[j] + Math.min(game(arr, i + 1, j - 1), game(arr, i, j - 2));

		int maxsum = Math.max(sumi, sumj);

		return maxsum;

	}

}
