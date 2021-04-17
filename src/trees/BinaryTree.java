package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}

	}

	private Node root = null;
	private int size = 0;

	BinaryTree() {
		Scanner scn = new Scanner(System.in);
		this.root = input(scn, null, false);

	}

	private Node input(Scanner scn, Node parent, Boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter data for the parent node");
		} else {

			if (isleftorright) {
				System.out.println("Enter data for the left child of " + parent.data);
			} else {
				System.out.println("Enter data for the right child of " + parent.data);
			}
		}

		int data = scn.nextInt();
		Node node = new Node(data, null, null);
		this.size++;
		System.out.println("does " + node.data + " has left child");
		Boolean choice = false;
		choice = scn.nextBoolean();
		if (choice) {
			node.left = input(scn, node, true);
		}

		choice = false;
		System.out.println("does " + node.data + " has right child");
		choice = scn.nextBoolean();
		if (choice) {
			node.right = input(scn, node, false);
		}

		return node;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node parent) {

		String str = "";
		if (parent.left != null) {
			str += parent.left.data + " => ";
		} else {
			str += "End => ";
		}
		str += parent.data;
		if (parent.right != null) {
			str += " <= " + parent.right.data;
		} else {
			str += " <= End";
		}
		System.out.println(str);
		if (parent.left != null) {
			display(parent.left);
		}
		if (parent.right != null) {
			display(parent.right);
		}

	}

	public int height() {
		int height = height(this.root);
		return height;
	}

	private int height(Node parent) {
		if (parent == null) {
			return -1;
		}

		int leftheight = height(parent.left);
		int rightheight = height(parent.right);

		int ans = Math.max(leftheight, rightheight) + 1;
		return ans;

	}

	// node left right
	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node parent) {
		if (parent == null) {
			return;
		}

		System.out.print(parent.data + " ");
		preorder(parent.left);
		preorder(parent.right);

	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node parent) {
		if (parent == null) {
			return;
		}

		inorder(parent.left);
		System.out.print(parent.data + " ");
		inorder(parent.right);

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node parent) {
		if (parent == null) {
			return;
		}

		postorder(parent.left);
		postorder(parent.right);
		System.out.print(parent.data + " ");

	}

	public void levelorder() {
		levelorder(this.root);
	}

	// levelorder is iterative
	private void levelorder(Node parent) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(parent);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);
			}
		}
	}

	// check for inorder ->if sorted than return true
	// another -> range method
	public boolean isbst() {
		return isbst(this.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private boolean isbst(Node parent, int max, int min) {
		if (parent == null) {
			return true;
		}

		if (parent.data < min || parent.data > max) {
			return false;
		} else if (!isbst(parent.left, parent.data, min)) {
			return false;
		} else if (!isbst(parent.right, max, parent.data)) {
			return false;
		}

		return true;

	}

	public ArrayList<Integer> iterativeinorder() {
		return iterativeinorder(this.root);
	}

	private ArrayList<Integer> iterativeinorder(Node parent) {
		Stack<Node> stack = new Stack<>();
		stack.push(parent);
		Node node = parent;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (node != null) {
			node = node.left;
			while (node == null) {
				if (!stack.isEmpty()) {
					node = stack.pop();
					list.add(node.data);
					node = node.right;
				} else {
					break;
				}
			}
			stack.push(node);
		}
		return list;
	}

	public int sumofleafnodes() {
		return sumofleafnodes(this.root);
	}

	private int sumofleafnodes(Node parent) {
		if (parent == null) {
			return 0;
		}
		if (parent.left == null && parent.right == null) {
			return parent.data;
		}

		int left = sumofleafnodes(parent.left);
		int right = sumofleafnodes(parent.right);

		return left + right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
