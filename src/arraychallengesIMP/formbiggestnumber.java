package arraychallengesIMP;

import java.util.Scanner;

public class formbiggestnumber {

	public static void biggestnumber(int[] arr) {
		String finalno = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String ij = "" + arr[i] + arr[j];
				String ji = "" + arr[j] + arr[i];
				if (ij.compareTo(ji) < 0) {
					int sum = arr[i] + arr[j];
					arr[i] = sum - arr[i];
					arr[j] = sum - arr[i];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			finalno += arr[i];
		}
		System.out.println(finalno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int m = scn.nextInt();
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			biggestnumber(arr);
			t--;
		}

	}

}
