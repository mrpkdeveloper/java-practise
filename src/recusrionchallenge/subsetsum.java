package recusrionchallenge;

import java.util.Scanner;

public class subsetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			if (subset(arr, 0, "", 0, 0)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}

	}

	public static boolean subset(int[] arr, int i, String ans, int sum, int target) {
		if (i == arr.length) {
			if (ans != "") {
				if (sum == target) {
//					System.out.println("***********" + sum);
					return true;
				}
			}
//			System.out.println(ans);
			return false;
		}
		boolean res1 = subset(arr, i + 1, ans, sum, target);
		boolean res2 = subset(arr, i + 1, ans + arr[i], sum + arr[i], target);
		if (res1 || res2) {
			return true;
		} else {
			return false;
		}

	}

}
