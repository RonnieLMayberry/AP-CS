import java.util.*;

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

	public Object find(Comparable target) {
		return findHelper(localRoot, target);
	}

	private Object findHelper(TreeNode root, Comparable target) {
		if (root == null)
			return null;

		int compareResult = target.compareTo(root.getValue());

		if (compareResult == 0)
			return root.getValue();
		else if (compareResult < 0)
			return findHelper(root.getLeft(), target);
		else
			return findHelper(root.getRight(), target);
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

	public void printInorder() {
		printInorderHelper(localRoot);
	}

	private void printInorderHelper(TreeNode root) {
		if (root != null) {
			printInorderHelper(root.getLeft());
			System.out.printf(" %s", root.getValue());
			printInorderHelper(root.getRight());
		}
	}

	public void NRprintInOrder() {
		NRprintInOrderHelper(localRoot);
	}

	private void NRprintInOrderHelper(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		do {
			while (root != null) {
				stack.push(root);
				root = root.getLeft();
			}
			
			if (stack != null) {
				root = stack.pop();
				System.out.printf(" %s", root.getValue());
				System.out.println();
				root = root.getRight();
			}
		} while (!(stack.isEmpty()) || root != null);
	}

	public void printPreorder() {
		printPreorderHelper(localRoot);
	}

	private void printPreorderHelper(TreeNode root) {
		if (root != null) {
			System.out.printf(" %s", root.getValue());
			printPreorderHelper(root.getLeft());
			printPreorderHelper(root.getRight());
		}
	}

	public void printPostorder() {
		printPostorderHelper(localRoot);
	}

	private void printPostorderHelper(TreeNode root) {
		if (root != null) {
			printPostorderHelper(root.getLeft());
			printPostorderHelper(root.getRight());
			System.out.printf(" %s", root.getValue());
		}
	}

	public void delete(Comparable target) {
		localRoot = deleteHelper(localRoot, target);
	}

	private TreeNode deleteHelper(TreeNode node, Comparable target) {
		if (node == null) {
			throw new NoSuchElementException();
		} else if (target.equals(node.getValue())) {
			return deleteTargetNode(node);
		} else if (target.compareTo(node.getValue()) < 0) {
			node.setLeft(deleteHelper(node.getLeft(), target));
			return node;
		} else {
			node.setRight(deleteHelper(node.getRight(), target));
			return node;
		}
	}

	private TreeNode deleteTargetNode(TreeNode target) {
		if (target.getRight() == null) {
			return target.getLeft();
		} else if (target.getLeft() == null) {
			return target.getRight();
		} else if (target.getRight().getLeft() == null) {
			target.setValue(target.getRight().getValue());
			target.setRight(target.getRight().getRight());
			return target;
		} else {
			TreeNode marker = target.getRight();
			while (marker.getLeft().getLeft() != null)
				marker = marker.getLeft();

			target.setValue(marker.getLeft().getValue());
			marker.setLeft(marker.getLeft().getRight());
			return target;
		}
	}

	public int countLeaves() {
		return countLeaves(localRoot);
	}

	private int countLeaves(TreeNode root) {
		if (root == null)
			return 0;
		else if ((root.getRight() == null) && (root.getLeft() == null))
			return 1;
		else
			return countLeaves(root.getLeft()) + countLeaves(root.getRight());
	}

	public int height() {
		return height(localRoot);
	}

	private int height(TreeNode root) {
		if (root == null)
			return 0;
		else
			return (max(1 + height(root.getLeft()), 1 + height(root.getRight())));
	}

	public int width() {
		return width(localRoot);
	}

	private int width(TreeNode root) {
		int temp;

		if (root == null)
			return 0;
		temp = height(root.getLeft()) + 1 + height(root.getRight());
		temp = max(temp, width(root.getLeft()));
		return max(temp, width(root.getRight()));
	}

	private int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public void clearTree() {
		localRoot = null;
	}

	public void interchange() {
		interchange(localRoot);
	}

	private void interchange(TreeNode root) {
		if (root != null) {
			TreeNode temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);

			interchange(root.getLeft());
			interchange(root.getRight());
		}
	}

	public boolean isAncestor(Comparable ancestor, Comparable descendant) {
		return isAncestor(localRoot, ancestor, descendant);
	}

	boolean isAncestor(TreeNode root, Comparable a, Comparable d) {
		if (findPtr(findPtr(root, a), d) != null)
			return true;
		else
			return false;
	}

	private TreeNode findPtr(TreeNode root, Comparable target) {
		if (root == null)
			return null;
		if (target.equals(root.getValue()))
			return root;
		if (target.compareTo(root.getValue()) < 0)
			return findPtr(root.getLeft(), target);
		else
			return findPtr(root.getRight(), target);
	}

	public void printLevel(int level) {
		printLevel(localRoot, level);
	}

	private void printLevel(TreeNode root, int level) {
		if ((root != null) && (level >= 0)) {
			if (level == 0)
				System.out.print(root.getValue() + " ");
			else {
				printLevel(root.getLeft(), level - 1);
				printLevel(root.getRight(), level - 1);
			}
		}
	}
}