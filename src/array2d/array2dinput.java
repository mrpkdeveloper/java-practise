package array2d;

import java.util.Scanner;

public class array2dinput {

	public static Scanner scn = new Scanner(System.in);

	public static int[][] inp2darray() {
		System.out.println("enter no of rows");
		int r = scn.nextInt();
		System.out.println("enter no of columns");
		int c = scn.nextInt();
		int[][] arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static int[][] disp2darray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = inp2darray();
		disp2darray(arr);
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		disp2darray(arr1);
	}

}
