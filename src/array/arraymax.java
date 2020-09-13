package array;

public class arraymax {

	public static void max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			if (val >= max) {
				max = val;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, -51, -8, -2, -3 };
		max(arr);

	}

}
