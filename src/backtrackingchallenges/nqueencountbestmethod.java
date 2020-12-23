package backtrackingchallenges;

import java.util.Scanner;

public class nqueencountbestmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean[][] arr = new boolean[n][n];
		boolean[] col = new boolean[n];
		boolean[] d1 = new boolean[2 * n - 1];
		boolean[] d2 = new boolean[2 * n - 1];
		System.out.println(nqueenbest(arr, n, 0, 0, col, d1, d2));

	}

	public static int nqueenbest(boolean[][] arr, int n, int qpsf, int r, boolean[] col, boolean[] d1, boolean[] d2) {
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
				d1[(r - j) + n - 1] = true;
				d2[r + j] = true;
				qpsf++;
				count += nqueenbest(arr, n, qpsf, r + 1, col, d1, d2);
				col[j] = false;
				d1[(r - j) + n - 1] = false;
				d2[r + j] = false;
				qpsf--;
				arr[r][j] = false;
			}
		}
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

	public static int nqueen(boolean[][] arr, int n, int qpsf, int r, int c, boolean[] col, boolean[] d1,
			boolean[] d2) {
//		a = a + 1;
//		System.out.println(a);

		int count = 0;
		if (qpsf == n) {
			return 1;
		}
		if (c == arr[0].length) {
			c = 0;
			r++;
		}
		if (r == arr.length) {
			return 0;
		}

		if (check2(arr, r, c, col, d1, d2)) {
//		if (check(arr, r, c)) {
			// queen placed
			arr[r][c] = true;
			col[c] = true;
			d1[(r - c) + n - 1] = true;
			d2[r + c] = true;
			qpsf++;
			count += nqueen(arr, n, qpsf, r + 1, 0, col, d1, d2);
			col[c] = false;
			d1[(r - c) + n - 1] = false;
			d2[r + c] = false;
			qpsf--;
			arr[r][c] = false;
		}
		// queen not placed
		count += nqueen(arr, n, qpsf, r, c + 1, col, d1, d2);
		return count;
	}

}
