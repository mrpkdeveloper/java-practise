package arraychallengesIMP;

import java.util.Scanner;

public class mattrixsearch {

	public static void matrixsearch(int[][] mat, int n) {
		int ans = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (n == mat[i][j]) {
					ans = 1;
					break;
				}
			}
		}
		System.out.println(ans);

	}

	public static int matrixsearchoptimised(int[][] mat, int n) {
		int ans = 0;
		int l = 0, r = mat.length * mat[0].length - 1, mid = (l + r) / 2;
		while (l <= r) {
			int row = mid / mat[0].length;
			int col = mid % mat[0].length;
			if (mat[row][col] == n) {
				return 1;
			} else if (mat[row][col] < n) {
				l = mid + 1;
			} else if (mat[row][col] > n) {
				r = mid - 1;
			}
			mid = (l + r) / 2;
		}
		return 0;

	}

	public static int matrixsearchoptimisedbest(int[][] mat, int n) {
		int ans = 0;
		int i = mat.length - 1, j = 0, val = mat[i][j];
		while (j < mat[0].length && i >= 0) {
			val = mat[i][j];
			if (val == n) {
				return 1;
			} else if (val < n) {
				j++;
			} else {
				i--;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		matrixsearch(mat, 6);
//		System.out.println(matrixsearchoptimised(mat, 23));
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] mat = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		int n = scn.nextInt();
		System.out.println(matrixsearchoptimisedbest(mat, n));

	}

}
