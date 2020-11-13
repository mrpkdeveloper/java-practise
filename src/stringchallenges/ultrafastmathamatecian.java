package stringchallenges;

import java.util.Scanner;

public class ultrafastmathamatecian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			String ans = "";
			while (n != 0) {
				int rem1 = n % 10;
				int rem2 = m % 10;
				n = n / 10;
				m = m / 10;
				if (rem1 == rem2) {
					ans = "0" + ans;
				} else {
					ans = "1" + ans;
				}
			}
			System.out.println(ans);
			t--;
		}

	}

}
