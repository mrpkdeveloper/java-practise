package printrecursion;

public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println(nqueens(board, 0));

	}

	public static int a = 0;

	public static int nqueens(boolean[][] board, int row) {
		a = a + 1;
		System.out.println(a);
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				count += nqueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;
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
