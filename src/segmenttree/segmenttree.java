package segmenttree;

public class segmenttree {

	private class Node {
		int data;
		int start;
		int end;
		Node left;
		Node right;

	}

	private Node root = null;

	segmenttree(int[] arr) {
		this.root = makesegmenttree(arr, 0, arr.length - 1);
	}

	private Node makesegmenttree(int[] arr, int si, int ei) {

		if (si == ei) {
			Node node = new Node();
			node.start = si;
			node.end = ei;
			node.data = arr[si];
			return node;
		}

		Node node = new Node();
		node.start = si;
		node.end = ei;
		int mid = (ei + si) / 2;
		node.left = makesegmenttree(arr, si, mid);
		node.right = makesegmenttree(arr, mid + 1, ei);
		// assuming query to be of sum
		node.data = node.left.data + node.right.data;

		return node;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node parent) {
		if (parent == null) {
			return;
		}
		String s = "";
		if (parent.left != null) {
			s += parent.left.data;
		} else {
			s += "END";
		}
		s += " => " + parent.data + " <= ";
		if (parent.right != null) {
			s += parent.right.data;
		} else {
			s += "END";
		}
		System.out.println(s);
		display(parent.left);
		display(parent.right);

	}

	public int query(int si, int ei) {
		return query(this.root, si, ei);
	}

	// here query is sum
	private int query(Node parent, int si, int ei) {
		int nsi = parent.start;
		int nei = parent.end;
		if (si <= nsi && ei >= nei) {
			return parent.data;
		} else if (nsi > ei || nei < si) {
			return 0; // return default value
		} else {
			int left = query(parent.left, si, ei);
			int right = query(parent.right, si, ei);
			return left + right;
		}

	}

	public void update(int[] arr, int i, int val) {
		arr[i] = val;
		this.root.data = update(arr, this.root, i, val);
	}

	private int update(int[] arr, Node parent, int i, int val) {
		int si = parent.start;
		int ei = parent.end;
		if (si <= i && i <= ei) {
			if (si == ei && si == i) {
				parent.data = val;
			} else {
				int left = update(arr, parent.left, i, val);
				int right = update(arr, parent.right, i, val);
				parent.data = left + right;
			}
		}

		return parent.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 8, 7, 6, -2, -8, 4, 9 };
		segmenttree tree = new segmenttree(arr);
//		tree.display();
//		System.out.println(tree.query(2, 6));
		tree.update(arr, 0, 2);
		tree.display();
	}

}
