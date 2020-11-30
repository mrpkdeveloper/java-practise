package printrecursion;

public class printboardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boardpath(0, 10, "");
		System.out.println(boardpathcount(0, 10));

	}

	public static void boardpath(int start, int end, String res) {
		// -ve base case
		if (start > end) {
			return;
		}
		if (start == end) {
			System.out.println(res);
			return;
		}

		for (int i = 1; i <= 6; i++) {
			boardpath(start + i, end, res + i);
		}

	}

	public static int boardpathcount(int start, int end) {
		// -ve base case
		if (start > end) {
			return 0;
		}
		if (start == end) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count += boardpathcount(start + i, end);
		}
		return count;

	}

}
