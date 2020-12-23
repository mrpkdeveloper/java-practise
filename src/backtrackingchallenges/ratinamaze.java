package backtrackingchallenges;

import java.util.Scanner;

public class ratinamaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();

		char maze[][] = new char[r][c]; // 2D char array
		for (int i = 0; i < r; i++) {
			String data = "";
			if (scn.hasNext()) { // input from user
				data = scn.next();
			} else {
				break;
			}
			for (int j = 0; j < c; j++)
				maze[i][j] = data.charAt(j);
		}

		int[][] ansarr = new int[r][c];

		if (maze(maze, "", 0, 0, ansarr) == false) {
			System.out.println(-1);
		}
	}

	public static boolean maze(char[][] arr, String ans, int r, int c, int[][] ansarr) {
		if (c == arr[0].length || r == arr.length) {
			return false;
		}

		if (arr[r][c] == 'X') {
			return false;
		}

		ansarr[r][c] = 1;
		if (c == arr[0].length - 1 && r == arr.length - 1) {
			printarr(ansarr);
			return true;
		}

		boolean rightpath = maze(arr, ans + "R", r, c + 1, ansarr);
		if (rightpath == true) {
			return true;
		}
		boolean downpath = maze(arr, ans + "D", r + 1, c, ansarr);
		if (downpath == true) {
			return true;
		}

		// if path does not exist
		ansarr[r][c] = 0;
		return false;
	}

	public static void printarr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
