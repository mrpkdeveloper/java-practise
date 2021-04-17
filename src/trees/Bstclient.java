package trees;

public class Bstclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inorder = { 1, 2, 3, 4, 5, 6, 7 };
		BST tree = new BST(inorder);
		tree.display();
//		System.out.println(tree.find(8));
//		tree.add(10);
//		tree.display();
//		System.out.println(tree.max());
		tree.remove(4);
		tree.display();

	}

}
