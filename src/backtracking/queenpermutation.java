package backtracking;

public class queenpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		qp(arr, "", 0, 2);

	}

	public static void qp(boolean box[], String ans, int qpsf, int tq) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < box.length; i++) {
			if (!box[i]) {
				box[i] = true;
				qpsf++;
				qp(box, ans + "q" + qpsf + "b" + i, qpsf, tq);
				box[i] = false;
				qpsf--;
			}
		}
	}
}
