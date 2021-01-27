package sorting;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 6, 4, 1, 2, 5 };
//		int[] arr = { 5, 3, 1, 2, 6, 4 };
		quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = partition(arr, lo, hi);
		quicksort(arr, lo, pivot - 1);
		quicksort(arr, pivot, hi);

	}

	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		;
		return i;
	}

}
