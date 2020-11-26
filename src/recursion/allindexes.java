package recursion;

public class allindexes {

	public static int[] index(int[] arr, int si, int val, int count) {
		if (si == arr.length) {
			int[] a = new int[count];
			return a;
		}
		if (arr[si] == val) {
			int[] ans = index(arr, si + 1, val, count + 1);
			ans[count] = si;
			return ans;
		} else {
			int[] ans = index(arr, si + 1, val, count);
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 3, 5, 6, 4 };
		int[] ans = index(arr, 0, 4, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
