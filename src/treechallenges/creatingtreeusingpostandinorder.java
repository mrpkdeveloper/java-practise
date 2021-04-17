package treechallenges;

import java.util.Scanner;

public class creatingtreeusingpostandinorder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		creatingtreeusingpostandinorder m = new creatingtreeusingpostandinorder();
//		int[] post = takeInput();
		int[] post = { 0, 1, 3, 2, 5, 7, 6, 4 };
//		int[] post = { 1, 3, 2 };
//		int[] in = takeInput();
		int[] in = { 0, 1, 2, 3, 4, 5, 6, 7 };
//		int[] in = { 1, 2, 3 };
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

			if (plo > phi || ilo > ihi) {
				return null;
			}

			Node node = new Node();
			node.data = post[phi];

			int ind = 0;
			for (int i = ilo; i <= ihi; i++) {
				if (node.data == in[i]) {
					ind = i;
					break;
				}
			}
			int noofnodeinleft = ind - ilo;

			node.left = construct(post, plo, plo + noofnodeinleft - 1, in, ilo, ind - 1);
			node.right = construct(post, plo + noofnodeinleft, phi - 1, in, ind + 1, ihi);

			return node;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
