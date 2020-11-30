package printrecursion;

public class printpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc", "");

	}

	public static void permutation(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			permutation(ros, res + ch);
		}

	}

}
