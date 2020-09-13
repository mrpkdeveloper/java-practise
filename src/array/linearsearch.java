package array;

public class linearsearch {

	public static int linearsearch(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 21, 32, 49, 5 };
		System.out.println(linearsearch(arr, 322));

	}

}
