package array;

public class insertionsort {

	public static void insertionsort(int[] arr) {
		for (int c = 1; c < arr.length; c++) {
			int val = arr[c];
			int j;
			for (j = c - 1; j >= 0; j--) {
				if (arr[j] > val) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = val;
		}
	}

	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		insertionsort(arr);
		disp(arr);

	}

}
