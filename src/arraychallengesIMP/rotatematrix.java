package arraychallengesIMP;

import java.util.Scanner;

public class rotatematrix {

	public static void rotatematrix(int[][] arr) {
		int[][] dummy = new int[arr.length][arr[0].length];
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				dummy[arr.length - 1 - j][i] = arr[i][j];
			}

		}

		for (int i = 0; i < dummy.length; i++) {
			for (int j = 0; j < dummy[0].length; j++) {
				System.out.print(dummy[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		rotatematrix(arr);

	}

}
