package printrecursion;

public class printnqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		nqueens(board, 0, "");

	}

	public static void nqueens(boolean[][] board, int row, String res) {
		if (row == board.length) {
			System.out.println(res);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				nqueens(board, row + 1, res + "{" + row + "-" + col + "}; ");
				board[row][col] = false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
//check for upper col
		for (int i = 0; i < row; i++) {
			if (board[i][col] == true) {
				return false;
			}
		}
//check for left diagnol		
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == true) {
				return false;
			}
		}
//check for right diagnol		
		for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
			if (board[i][j] == true) {
				return false;
			}
		}

		return true;

	}

}
