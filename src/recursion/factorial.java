package recursion;

public class factorial {

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int ans = n * fact(n - 1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));

	}

}
