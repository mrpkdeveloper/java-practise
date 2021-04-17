package treechallenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class kthlevelsum {
	static Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root = null;

	public kthlevelsum() {
		this.root = takeinput(scn, null, 0);
	}

	public Node takeinput(Scanner scn, Node parent, int ithchild) {
//		if (parent == null) {
//			System.out.println("enter data for parent");
//		} else {
//			System.out.println("enter data for ith child");
//		}

		int data = scn.nextInt();
		Node node = new Node(data);
		int noc = scn.nextInt();
		for (int i = 1; i <= noc; i++) {
			Node child = takeinput(scn, node, i);
			node.children.add(child);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node parent) {
		String str = parent.data + " => ";
		ArrayList<Node> child = parent.children;
		for (Node node : child) {
			str += node.data + ",";
		}
		str += "END";
		System.out.println(str);
		for (Node node : child) {
			display(node);
		}

	}

	public int levelsum(int k) {
		return levelsum(this.root, k);
	}

	private int levelsum(Node parent, int k) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(parent);
		queue.addLast(null);
		int level = 0, sum = 0;
		System.out.print(level + " ------ ");
		while (!queue.isEmpty()) {
			if (level > k) {
				break;
			}
			Node rv = queue.removeFirst();
			if (rv == null) {
				if (queue.isEmpty()) {
					break;
				}
				level++;
				System.out.print(level + " ------ ");
				queue.addLast(null);
			} else {
				if (level == k) {
					sum += rv.data;
				}
				System.out.print(rv.data + " ");
				ArrayList<Node> children = rv.children;
				for (Node node : children) {
					queue.addLast(node);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthlevelsum tree = new kthlevelsum();
//		tree.display();
		int k = scn.nextInt();
		System.out.println(tree.levelsum(k));
	}

}
