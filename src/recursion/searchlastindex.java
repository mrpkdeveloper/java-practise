package recursion;

public class searchlastindex {

	public static int lastindex(int[] arr, int si, int val) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastindex(arr, si + 1, val);
		if (index == -1) {
			if (arr[si] == val) {
				return si;
			} else {
				return -1;
			}

		} else {
			return index;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 5, 7, 3 };
		System.out.println(lastindex(arr, 0, 2));

	}
}
