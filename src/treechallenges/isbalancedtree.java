package treechallenges;

import java.util.Scanner;

public class isbalancedtree {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		isbalancedtree m = new isbalancedtree();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
			// write your code here
			if (node == null) {
				BalancedPair ans = new BalancedPair();
				ans.height = -1;
				ans.isBalanced = true;
				return ans;
			}

			BalancedPair left = isBalanced(node.left);
			BalancedPair right = isBalanced(node.right);

			BalancedPair ans = new BalancedPair();
			ans.height = Math.max(left.height, right.height) + 1;
			ans.isBalanced = Math.abs(left.height - right.height) <= 1 && left.isBalanced && right.isBalanced;

			return ans;

		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}

}
