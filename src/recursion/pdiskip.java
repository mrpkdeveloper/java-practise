package recursion;

public class pdiskip {

	public static void pdiskip(int n) {
		if (n % 2 == 1) {
			System.out.println(n);
		}
		if (n == 0) {
			return;
		}
		pdiskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdiskip(5);

	}

}
