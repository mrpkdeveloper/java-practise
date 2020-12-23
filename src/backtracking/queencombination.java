package backtracking;

public class queencombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		qp(arr, "", 0, 2, 0);

	}

	public static void qp(boolean box[], String ans, int qpsf, int tq, int lbu) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = lbu; i < box.length; i++) {
			if (!box[i]) {
				box[i] = true;
				qpsf++;
				qp(box, ans + "q" + qpsf + "b" + i, qpsf, tq, i + 1);
				box[i] = false;
				qpsf--;
			}
		}
	}

}
