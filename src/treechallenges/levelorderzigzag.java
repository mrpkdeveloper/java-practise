package treechallenges;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class levelorderzigzag {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		levelorderzigzag m = new levelorderzigzag();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			// write your code here

			levelOrderZZ(this.root);
		}

		private void levelOrderZZ(Node parent) {

			Stack<Node> p = new Stack<>();
			Stack<Node> c = new Stack<>();

			p.add(parent);
			int level = 0;
			while (p.size() > 0) {
				Node rv = p.pop();
				System.out.print(rv.data + " ");
				if (level % 2 == 0) {
					if (rv.left != null) {
						c.add(rv.left);
					}
					if (rv.right != null) {
						c.add(rv.right);
					}
				} else {
					if (rv.right != null) {
						c.add(rv.right);
					}
					if (rv.left != null) {
						c.add(rv.left);
					}
				}

				if (p.size() == 0) {
					p = c;
					c = new Stack<>();
					level++;
				}
			}

		}

	}

}
