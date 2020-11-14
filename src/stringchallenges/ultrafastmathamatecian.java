package stringchallenges;

import java.util.Scanner;

public class ultrafastmathamatecian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			String a = scn.next();
			String b = scn.next();

			StringBuilder ans = new StringBuilder("");
			for (int i = 0; i < a.length(); i++) {

				if (a.charAt(i) == b.charAt(i)) {
					ans.append("0");
				} else {
					ans.append("1");
				}
			}
			System.out.println(ans);
			t--;
		}

	}

}
