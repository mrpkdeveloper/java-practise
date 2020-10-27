package stringchallenges;

import java.util.Scanner;

public class maxfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
//		String str = "aabaabaabaaccccccccccccbabbwbebrbtbybubib";
		int[] arr = new int[128];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		int max = 0;
		char res = 'z';
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				res = (char) i;
			}
		}
		System.out.println(res);

	}

}
