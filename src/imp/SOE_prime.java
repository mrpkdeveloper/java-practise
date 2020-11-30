package imp;

import java.util.Arrays;

import arraychallengesIMP.formbiggestnumber;

public class SOE_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soe(23);

	}

	public static void soe(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;

		for (int i = 2; i * i < arr.length; i++) {

			if (arr[i] == true) {
				for (int j = 2; i * j < arr.length; j++) {
					arr[i * j] = false;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.println(i);
			}
		}
	}

}
