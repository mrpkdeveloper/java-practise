package sorting;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = { 5, 10, 20, 21, 22, 23, 24, 25 };
//		int[] arr2 = { 1, 2, 6, 19, 20 };
//		int[] ans = mergearray(arr1, arr2);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}

		int[] arr = { 2, 7, 1, 5, 3 };
		int[] merge = mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < merge.length; i++) {
			System.out.println(merge[i]);
		}

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ans = new int[1];
			ans[0] = arr[lo];
			return ans;
		}
		int mid = (lo + hi) / 2;
		int[] arr1 = mergesort(arr, lo, mid);
		int[] arr2 = mergesort(arr, mid + 1, hi);
		int[] ans = mergearray(arr1, arr2);
		return ans;

	}

	public static int[] mergearray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}

		return ans;

	}

}
