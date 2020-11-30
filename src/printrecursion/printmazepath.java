package printrecursion;

public class printmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazepath(0, 0, 2, 2, "");

	}

	public static void mazepath(int cx, int cy, int fx, int fy, String res) {

		if (cx > fx || cy > fy) {
			return;
		}
		if (cx == fx && cy == fy) {
			System.out.println(res);
			return;
		}

		mazepath(cx + 1, cy, fx, fy, res + "H");
		mazepath(cx, cy + 1, fx, fy, res + "V");

	}
}
