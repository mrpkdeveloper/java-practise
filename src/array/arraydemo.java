package array;

import java.util.Scanner;

public class arraydemo {

	static Scanner scn = new Scanner(System.in);

	public static void swap(int[] arr, int one, int two) {
		arr[one] = arr[one] + arr[two];
		arr[two] = arr[one] - arr[two];
		arr[one] = arr[one] - arr[two];
	}

	public static int[] inparr() {
		System.out.println("Enter size of array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		System.out.println(arr);
//		int[] arr1 = { 1, 2, 3 };
//		System.out.println(arr1);
//		swap(arr1, 0, 1);
//		System.out.println(arr1[0] + " " + arr1[1]);
		int[] arr = inparr();
		disp(arr);

	}

}
