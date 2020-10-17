package arraychallengesIMP;

import java.util.Scanner;

public class primevisit {

// generating array containing prime numbers
	public static void primesieve(int[] arr) {
//		marking all odd no to be prime as they can be prime
		for (int i = 3; i < arr.length; i += 2) {
			arr[i] = 1;
		}

		for (long i = 3; i < arr.length; i += 2) {
			// if the current no is not marked than it is prime
			if (arr[(int) i] == 1) {
				// now cross the multiples of i
				for (long j = i * i; j < arr.length; j = j + i) {
					arr[(int) j] = 0;
				}
			}

		}

		// some base case
		arr[0] = arr[1] = 0;
		arr[2] = 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1000005];
		primesieve(arr);

		int[] csum = new int[1000005];
		for (int i = 1; i < csum.length; i++) {
			csum[i] = csum[i - 1] + arr[i];
		}

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			if (a == 0) {
				System.out.println(csum[b] - csum[a]);
			} else {
				System.out.println(csum[b] - csum[a - 1]);
			}

			t--;
		}

	}

}
