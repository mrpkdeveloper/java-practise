package array2d;

public class waveprint {

	public static void waveprint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = 0;

			if (i % 2 == 0) {
				for (j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]);
				}
			} else {
				for (j = arr[0].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j]);
				}

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		waveprint(arr);

	}

}
