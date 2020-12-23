package backtracking;

public class coinchangewrtcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc(10, 0, 0, "");

	}

	public static int[] domination = { 2, 3, 5, 6 };

	public static void cc(int amount, int asf, int coinused, String ans) {
		if (asf > amount) {
			return;
		}
		if (asf == amount) {
			System.out.println(ans);
			return;
		}
		if (coinused == domination.length) {
			return;
		}

		// coin used
		asf = asf + domination[coinused];
		cc(amount, asf, coinused, ans + domination[coinused]);
		asf = asf - domination[coinused];

		// coin not used
		cc(amount, asf, coinused + 1, ans);

	}

}
