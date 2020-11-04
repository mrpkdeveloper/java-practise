package stringchallenges;

import java.util.Scanner;

public class piyushandmagicalpark {

	public static void path(int n, int m, int k, int s, char[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (s < k) {
					System.out.println("No");
					return;
				}
				if (mat[i][j] == '.') {
					s = s - 2;
				} else if (mat[i][j] == '*') {
					s = s + 5;
				} else {
					break;
				}
				if (j != n - 1) {
					s = s - 1;
				}

			}
		}
		System.out.println("Yes");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int s = scn.nextInt();
		char[][] mat = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = scn.next().charAt(0);
			}
		}
//		char[][] mat = { { '.', '.', '*', '.' }, { '.', '#', '.', '.' }, { '*', '*', '.', '.' },
//				{ '.', '#', '*', '*' } };
		path(n, m, k, s, mat);
	}

}
