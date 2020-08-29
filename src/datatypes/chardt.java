package datatypes;

import java.util.Scanner;

public class chardt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch >= 97 && ch <= 122) {
			System.out.println("lower");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("upper");
		}

	}

}
