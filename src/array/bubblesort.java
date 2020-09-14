package array;

public class bubblesort {

	public static void bubblesort(int[] arr) {
		boolean noswap = true;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1] + arr[j];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					noswap = false;
				}
			}
			if (noswap) {
				break;
			}
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
		bubblesort(arr);
		disp(arr);

	}

}
