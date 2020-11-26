package recursion;

public class pattern {

	public static void pattern(int n, int r, int c) {
		if (r == n + 1) {
			return;
		}
		if (c <= r) {
			System.out.print("*");
			pattern(n, r, c + 1);
		} else {
			System.out.println();
			pattern(n, r + 1, 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5, 1, 1);

	}

}
