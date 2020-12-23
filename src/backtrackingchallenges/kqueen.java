package backtrackingchallenges;

import java.util.Scanner;

public class kqueen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter chess board size :");
		int n = scn.nextInt();
		System.out.println("enter no of queens :");
		int noq = scn.nextInt();
		boolean[][] arr = new boolean[n][n];
		boolean[] col = new boolean[n];
		boolean[] d1 = new boolean[2 * n];
		boolean[] d2 = new boolean[2 * n];
		System.out.println(Kqueenbest(arr, noq, 0, 0, col, d1, d2));

	}

	public static int Kqueenbest(boolean[][] arr, int n, int qpsf, int r, boolean[] col, boolean[] d1, boolean[] d2) {
		int count = 0;
		if (qpsf == n) {
			return 1;
		}
		if (r == arr.length) {
			return 0;
		}
		// for every col
		for (int j = 0; j < arr[0].length; j++) {
			if (check2(arr, r, j, col, d1, d2)) {
				// queen placed
				arr[r][j] = true;
				col[j] = true;
				d1[(r - j) + arr.length - 1] = true;
				d2[r + j] = true;
//				qpsf++;
				count += Kqueenbest(arr, n, qpsf + 1, r + 1, col, d1, d2);
				col[j] = false;
				d1[(r - j) + arr.length - 1] = false;
				d2[r + j] = false;
//				qpsf--;
				arr[r][j] = false;
			}
		}
		count += Kqueenbest(arr, n, qpsf, r + 1, col, d1, d2);
		return count;

	}

	public static boolean check2(boolean[][] board, int i, int j, boolean[] col, boolean[] d1, boolean[] d2) {

		// check for upper col
		if (col[j] == true) {
			return false;
		}

		// check for left diag
		if (d1[(i - j) + board.length - 1] == true) {
			return false;
		}

		// check for right diag
		if (d2[i + j] == true) {
			return false;
		}

		return true;

	}

}
