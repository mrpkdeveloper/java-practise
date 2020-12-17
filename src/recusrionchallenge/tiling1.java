package recusrionchallenge;

public class tiling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tiling1(3));

	}

	public static int tiling1(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 1) {
			return 1;
		}
		int myans = tiling1(n - 1) + tiling1(n - 2);
		return myans;
	}

}
