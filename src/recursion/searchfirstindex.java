package recursion;

public class searchfirstindex {

	public static int firstindex(int[] arr, int si, int val) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == val) {
			return si;
		} else {
			int ans = firstindex(arr, si + 1, val);
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 5, 7, 3 };
		System.out.println(firstindex(arr, 0, 4));

	}

}
