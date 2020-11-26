package recursion;

public class basic {

	public static void basic(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		basic(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic(5);

	}

}
