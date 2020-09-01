package challenges;

import java.util.Scanner;

public class farehnitetocelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();
		int c = 0;
		for (int i = min; i <= max; i += step) {
			c = (int) ((5.0 / 9.0) * (i - 32));
			System.out.println(i + " " + c);

		}
	}

}
