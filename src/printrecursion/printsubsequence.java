package printrecursion;

public class printsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequence("abc", "");

	}

	public static void subsequence(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		subsequence(ros, res);
		subsequence(ros, res + ch);

	}

}
