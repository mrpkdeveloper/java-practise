package arraysortandsearch;

public class binarysearch {

	public static int binarysearch(int[] arr, int n) {

		int l = 0, r = arr.length - 1, mid = (l + r) / 2;
		while (l <= r) {
			if (n == arr[mid]) {
				return mid;
			} else if (n > arr[mid]) {
				l = mid + 1;
			} else if (n < arr[mid]) {
				r = mid - 1;
			}
			mid = (l + r) / 2;

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 12, 25, 37, 43, 59, 61, 73, 86 };
		System.out.println(binarysearch(arr, 61));

	}

}
