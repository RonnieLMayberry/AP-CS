
@SuppressWarnings("all")
public class BinarySearchTree {
	private TreeNode localRoot;

	public BinarySearchTree() {
		localRoot = null;
	}

	public void insert(Comparable next) {
		localRoot = insertHelper(localRoot, next);
	}

	private TreeNode insertHelper(TreeNode root, Comparable next) {
		if (root == null)
			root = new TreeNode(next, null, null);
		else if (next.compareTo(root.getValue()) <= 0)
			root.setLeft(insertHelper(root.getLeft(), next));
		else
			root.setRight(insertHelper(root.getRight(), next));
		return root;
	}

	public int countNodes() {
		return countNodesHelper(localRoot);
	}

	private int countNodesHelper(TreeNode root) {
		if (root == null)
			return 0;
		else
			return countNodesHelper(root.getLeft()) + 1 + countNodesHelper(root.getRight());
	}

	public void print() {
		printInorder(localRoot);
	}

	private void printInorder(TreeNode root) {
		if (root != null) {
			printInorder(root.getLeft());
			System.out.printf("%10d%10d\n", ((Item) (root.getValue())).getId(), ((Item) (root.getValue())).getInv());
			printInorder(root.getRight());
		}
	}
}