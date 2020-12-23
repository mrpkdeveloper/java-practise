package backtracking;

public class blockedmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[3][3];
		board[1][0] = true;
		mazepath(board, board.length - 1, board[0].length - 1, 0, 0, "");
	}

	public static void mazepath(boolean[][] board, int fr, int fc, int row, int col, String ans) {
		if (row > fr || row < 0 || col < 0 || col > fc) {
			return;
		}
		if (row == fr && col == fc) {
			System.out.println(ans);
			return;
		}

		if (board[row][col] == true) {
			return;
		}

		// right call
		board[row][col] = true;

		mazepath(board, fr, fc, row, col + 1, ans + "R");
		// down call
		mazepath(board, fr, fc, row + 1, col, ans + "D");
		// left call
		mazepath(board, fr, fc, row, col - 1, ans + "L");
		// up call
		mazepath(board, fr, fc, row - 1, col, ans + "U");

		board[row][col] = false;
	}

}
