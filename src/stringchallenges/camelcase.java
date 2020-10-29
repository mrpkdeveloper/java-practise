package stringchallenges;

import java.util.Scanner;

public class camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
//		String str = "IasAmACompetitiveProgrammer";
		int word = 0;
		System.out.print(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				System.out.print(str.charAt(i));
			} else {
				System.out.println();
				System.out.print(str.charAt(i));
			}

		}
 
	}

}
