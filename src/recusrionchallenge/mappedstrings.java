package recusrionchallenge;

import java.util.Scanner;

public class mappedstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		mapped(str, "");

	}

	public static String[] arr = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	public static void mapped(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch1 = str.charAt(0);
		String ach1 = arr[ch1 - '0'];
		String ros1 = str.substring(1);
		mapped(ros1, ans + ach1);

		if (str.length() != 1) {
			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);
			int i = Integer.parseInt(ch2);
			if (i < arr.length - 1) {
				String ach2 = arr[i];
				mapped(ros2, ans + ach2);
			}
		}

	}

}
