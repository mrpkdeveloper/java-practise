package recursion;

public class power {

	public static int power(int n, int p) {
		if (p == 0) {
			return 1;
		}

		int ans = n * power(n, p - 1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 3));
	}

}
