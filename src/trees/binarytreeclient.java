package trees;

public class binarytreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		// 1 true 2 false false true 3 true 4 false false true 5 false false
		// 1 true 2 false false true 3 true 4 false false true 5 true 6 true 7 false
		// false false false
		tree.display();
		System.out.println(tree.height());
		tree.preorder();
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.postorder();
		System.out.println();
		tree.levelorder();
		System.out.println(tree.isbst());
		System.out.println(tree.iterativeinorder());
		System.out.println(tree.sumofleafnodes());
	}

}
