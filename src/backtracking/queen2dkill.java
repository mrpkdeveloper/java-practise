package backtracking;

public class queen2dkill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		queen2d(board, 0, 0, 3, 0, "");

	}

	public static void queen2d(boolean[][] arr, int i, int j, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (j == arr[0].length) {
			i++;
			j = 0;
		}
		if (i == arr.length) {
			return;
		}

		if (check(arr, i, j)) {
			// queen placed
			arr[i][j] = true;
			qpsf++;
			queen2d(arr, i + 1, 0, tq, qpsf, ans + "q" + qpsf + "b(" + i + "," + j + ")");
			arr[i][j] = false;
			qpsf--;
		}

		// queen not placed
		queen2d(arr, i, j + 1, tq, qpsf, ans);

	}

	public static boolean check(boolean[][] board, int i, int j) {

		// check for current row
		for (int j2 = 0; j2 < j; j2++) {
			if (board[i][j2] == true) {
				return false;
			}
		}
		// check for upper col
		for (int j2 = 0; j2 < i; j2++) {
			if (board[j2][j] == true) {
				return false;
			}
		}

		// check for left diag
		for (int j2 = j - 1, i2 = i - 1; j2 >= 0 && i2 >= 0; j2--, i2--) {
			if (board[i2][j2] == true) {
				return false;
			}
		}

		// check for right diag
		for (int j2 = j + 1, i2 = i - 1; j2 < board[0].length && i2 >= 0; j2++, i2--) {
			if (board[i2][j2] == true) {
				return false;
			}
		}

		return true;

	}

}
