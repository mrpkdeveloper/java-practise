package imp;

public class deutchflag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0, 2, 1, 0, 1, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void sort(int[] arr) {
		int lo = 0, mid = 0, hi = arr.length - 1;
		while (mid <= hi) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				lo++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;

			}

		}
	}

}
