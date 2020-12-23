package backtracking;

public class queencombwrtbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		qp(arr, "", 0, 2, 0);

	}

	public static void qp(boolean box[], String ans, int qpsf, int tq, int boxno) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (boxno == box.length) {
			return;
		}

		// queen placed
		box[boxno] = true;
		qpsf++;
		qp(box, ans + "q" + qpsf + "b" + boxno, qpsf, tq, boxno + 1);
		box[boxno] = false;
		qpsf--;
		// not placed
		qp(box, ans, qpsf, tq, boxno + 1);

	}

}
