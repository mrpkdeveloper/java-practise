package arraysortandsearch;

public class upperboundelement {

	public static int lowerbound(int[] arr, int n) {
		int ans = -1;
		int l = 0, r = arr.length - 1, mid = (l + r) / 2;
		while (l <= r) {
			if (n == arr[mid]) {
				l = mid + 1;
				ans = mid;
			} else if (n > arr[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			mid = (l + r) / 2;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6 };
		System.out.println(lowerbound(arr, 5));

	}

}
