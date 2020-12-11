package recusrionchallenge;

public class smartkeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad1("33", "");
	}

	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void keypad1(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		// for converting char to int
		String code = table[ch - '0'];

		for (int i = 0; i < code.length(); i++)
			keypad1(ros, ans + code.charAt(i));

	}

}
