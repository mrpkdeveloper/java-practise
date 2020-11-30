package imp;

public class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 5));

	}

	public static int power(int base, int power) {
		if (power == 0) {
			return 1;
		}

		int halfpower = power(base, power / 2);
		int ans = 0;
		if (power % 2 == 0) {
			ans = halfpower * halfpower;
		} else {
			ans = halfpower * halfpower * base;
		}
		return ans;
	}

}
