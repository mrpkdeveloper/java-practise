package arraychallengesIMP;

public class largefactorial {

	public static void largefact(int n) {
		long[] arr = new long[n + 1];
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i * arr[i - 1];
		}
		System.out.println(arr[n]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		largefact(n);

	}

}
