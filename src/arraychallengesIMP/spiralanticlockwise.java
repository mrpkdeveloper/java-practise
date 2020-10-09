package arraychallengesIMP;

import java.util.Scanner;

public class spiralanticlockwise {

	public static void spiralanti(int[][] arr) {
		int col = arr[0].length;
		int row = arr.length;
		int l = 0, r = col - 1, u = 0, d = row - 1, n = col * row, dir = 1;
		int i = u, j = l;
		while (n > 0) {
			if (dir == 1 && i <= d) {
				System.out.print(arr[i][j] + ", ");
				i++;
			} else if (dir == 2 && j <= r) {
				System.out.print(arr[i][j] + ", ");
				j++;
			} else if (dir == 3 && i >= u) {
				System.out.print(arr[i][j] + ", ");
				i--;
			} else if (dir == 4 && j >= l) {
				System.out.print(arr[i][j] + ", ");
				j--;
			}

			if (i > d) {
				i = d;
				dir = 2;
				l++;
				j = l;
			} else if (i < u) {
				i = u;
				dir = 4;
				r--;
				j = r;
			} else if (j > r) {
				j = r;
				dir = 3;
				d--;
				i = d;
			} else if (j < l) {
				j = l;
				dir = 1;
				u++;
				i = u;
			}

			n--;
		}
		System.out.print("END");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		spiralanti(arr);

	}

}