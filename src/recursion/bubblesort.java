package recursion;

public class bubblesort {

	public static void sort(int[] arr, int si, int ei) {
		if (si == ei) {
			return;
		}
		if (arr[si] > arr[si + 1]) {
			arr[si] += arr[si + 1];
			arr[si + 1] = arr[si] - arr[si + 1];
			arr[si] = arr[si] - arr[si + 1];
		}
		sort(arr, si + 1, ei);
		sort(arr, 0, ei - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 1, 4, 3 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
