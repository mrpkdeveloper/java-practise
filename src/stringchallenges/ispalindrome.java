package stringchallenges;

import java.util.Scanner;

public class ispalindrome {

	public static boolean ispalindrome(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i <= j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(ispalindrome(arr));

	}

}
