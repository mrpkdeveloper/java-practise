package arraychallengesIMP;

public class bitonicsubarray {

	public static void bitonicsubarray(int[] arr) {
		int[] inclr = new int[arr.length];
		int[] incrl = new int[arr.length];
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int c = 0, c2 = 0;
		for (int i = 0; i < inclr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				c++;
				inclr[i] = c;
			} else {
				c = 1;
				inclr[i] = c;
				max = arr[i];
			}

			if (max2 < arr[arr.length - 1 - i]) {
				max2 = arr[arr.length - 1 - i];
				c2++;
				incrl[arr.length - 1 - i] = c2;
			} else {
				c2 = 1;
				incrl[arr.length - 1 - i] = c2;
				max2 = arr[arr.length - 1 - i];
			}
			System.out.println(arr.length - 1 - i + "-" + incrl[i]);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 4, 78, 90, 45, 23, 50, 60, 70 };
		bitonicsubarray(arr);
	}

}
