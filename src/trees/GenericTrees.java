package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {
	private class Node {
		int data;
		ArrayList<Node> children;

		// constructor
		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	// constructor for generic tree class
	GenericTrees() {
		Scanner scn = new Scanner(System.in);
		this.root = input(scn, null, 0);
	}

	// function to input nodes and return root mode of tree
	private Node input(Scanner scn, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("enter data for the parent node");
		} else {
			System.out.println("enter data for the " + ithchild + " ith child of " + parent.data);
		}

		int data = scn.nextInt();
		Node node = new Node(data);
		this.size++;

		System.out.println("Enter the no of Childrens of " + node.data);
		int childrens = scn.nextInt();
		for (int i = 0; i < childrens; i++) {
			Node child = input(scn, node, i);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 60 2 41 2 17 0 16 0 15 0
		GenericTrees tree = new GenericTrees();
		tree.display();

	}

}
