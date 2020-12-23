package backtrackingchallenges;

import java.util.Scanner;

public class suduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

//		int[][] sudoku = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
//				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
//				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		sudokusolver(arr, 0, 0);

	}

	public static void printarr(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[0].length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void sudokusolver(int[][] arr, int r, int c) {
		if (c == arr[0].length) {
			c = 0;
			r++;
		}
		if (r == arr.length) {
			printarr(arr);
//			System.out.println("**************************");
			return;
		}

		if (arr[r][c] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(arr, r, c, i)) {
					arr[r][c] = i;
					sudokusolver(arr, r, c + 1);
					arr[r][c] = 0;
				}
			}
		} else {
			sudokusolver(arr, r, c + 1);
		}
	}

	public static boolean check(int[][] arr, int r, int c, int i) {

		// check for row
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[r][j] == i) {
				return false;
			}
		}

		// check for col
		for (int j = 0; j < arr.length; j++) {
			if (arr[j][c] == i) {
				return false;
			}
		}

		// check for box
		int rstr = (r / 3) * 3;
		int cstr = (c / 3) * 3;
		for (int j = rstr; j < rstr + 3; j++) {
			for (int j2 = cstr; j2 < cstr + 3; j2++) {
				if (arr[j][j2] == i) {
					return false;
				}
			}

		}

		return true;
	}

}
