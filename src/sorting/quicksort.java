package sorting;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = (lo + hi) / 2;
		int l = lo, r = hi;
		while (l <= r) {
			while (arr[l] < arr[pivot]) {
				l++;
			}
			while (arr[r] > arr[pivot]) {
				r--;
			}
			if (l <= r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}

		}
		quicksort(arr, lo, r);
		quicksort(arr, l, hi);

	}

}
