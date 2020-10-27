package arraysortandsearch;

public class selectionsort {

	public static void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(i);
			disp(arr);
			System.out.println();
			System.out.println();

		}
	}

	public static void disp(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		selectionsort(arr);
//		disp(arr);

	}

}
