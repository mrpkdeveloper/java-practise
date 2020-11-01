package stringchallenges;

import java.util.Scanner;

public class asciidifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int i = 0, j = 1;
		System.out.print(s.charAt(i));
		while (j < s.length() && i < j) {
			System.out.print((s.charAt(j) - s.charAt(i)));
			System.out.print(s.charAt(j));
			i++;
			j++;

		}

	}

}
