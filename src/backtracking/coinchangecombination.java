package backtracking;

public class coinchangecombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		coinchange(10, 0, "");
		coinchangecomb(10, 0, "", 0);

	}

	public static int[] domination = { 2, 3, 5, 6 };

	// permutations
	public static void coinchange(int sum, int sumsofar, String ans) {
		if (sumsofar > sum) {
			return;
		}

		if (sumsofar == sum) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < domination.length; i++) {
			coinchange(sum, sumsofar + domination[i], ans + domination[i]);
		}

	}

	// combinations
	public static void coinchangecomb(int sum, int sumsofar, String ans, int lastcoinused) {
		if (sumsofar > sum) {
			return;
		}

		if (sumsofar == sum) {
			System.out.println(ans);
			return;
		}

		for (int i = lastcoinused; i < domination.length; i++) {
			coinchangecomb(sum, sumsofar + domination[i], ans + domination[i], i);
		}

	}

}
