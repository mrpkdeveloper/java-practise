package stringchallenges;

public class ultrafastmathamatecian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10111;
		int m = 10000;
		int ans = 0;
		while (n != 0) {
			int rem1 = n % 10;
			int rem2 = m % 10;
			if (rem1 == rem2) {
				ans = ans + rem1;
			}
		}

	}

}
