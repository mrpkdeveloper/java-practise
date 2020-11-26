package recursion;

public class checksorted {

	public static boolean checksorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean ans = checksorted(arr, si + 1);
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(checksorted(arr, 0));

	}

}
