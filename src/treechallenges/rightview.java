package treechallenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class rightview {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		ArrayList<Integer> list = 
//		int[] levelorder = { 1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1 };
//		rightview(levelorder);

	}

	public static void rightview(int[] levelorder) {

		int i = 0;
		int j = 0;
		while (i < levelorder.length && j < levelorder.length) {
			for (int j2 = j; j2 >= i; j2--) {
				if (levelorder[j2] != -1) {
					System.out.println(levelorder[j2]);
					break;
				}
			}
			i = j + 1;
			j = (int) Math.pow(2, i);
		}

	}

//	ArrayList<Integer> rightView(Node node) {
//		// add code here.
//		LinkedList<Node> queue = new LinkedList<>();
//		queue.add(node);
//		while (!queue.isEmpty()) {
//			int sz = queue.size();
//			Node rv;
//			while (sz > 0) {
//				rv = queue.removeFirst();
////				System.out.print(rv.data + " ");
//				if (rv.left != null) {
//					queue.addLast(rv.left);
//				}
//				if (rv.right != null) {
//					queue.addLast(rv.right);
//				}
//				sz--;
//			}
//			System.out.println(rv.data);
//		}
//
//	}

}
