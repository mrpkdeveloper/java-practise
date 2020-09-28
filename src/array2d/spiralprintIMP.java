package array2d;

public class spiralprintIMP {

	public static void spiralprint(int[][] arr) {
		int top = 0, bot = arr.length - 1, l = 0, r = arr[0].length - 1, count = (bot + 1) * (r + 1), dir = 1;
		int c = 1, i = 0, j = 0;
		while (c <= count) {

			while (dir == 1 && j <= r) {
				System.out.print(arr[i][j] + " ");
				j++;
				c++;
			}
			while (dir == 2 && i <= bot) {
				System.out.print(arr[i][j] + " ");
				i++;
				c++;
			}
			while (dir == 3 && j >= l) {
				System.out.print(arr[i][j] + " ");
				j--;
				c++;
			}
			while (dir == 4 && i >= top) {
				System.out.print(arr[i][j] + " ");
				i--;
				c++;
			}

			if (j > r) {
				dir = 2;
				j = r;
				top++;
				i = top;
			} else if (i > bot) {
				dir = 3;
				i = bot;
				r--;
				j = r;
			} else if (j < l) {
				dir = 4;
				j = l;
				bot--;
				i = bot;
			} else {
				dir = 1;
				i = top;
				l++;
				j = l;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiralprint(arr);

	}

}
