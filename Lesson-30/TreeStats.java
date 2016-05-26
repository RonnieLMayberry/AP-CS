import java.io.*;
import java.util.Scanner;

@SuppressWarnings("all")
public class TreeStats {
	private Scanner console;

	public TreeStats() {
		console = new Scanner(System.in);
	}

	public void readData(BinarySearchTree temp) {
		Scanner inFile;

		String fileName;
		String str;
		Scanner fileN = new Scanner(System.in);
		System.out.print("Filename: ");
		fileName = fileN.nextLine();
		try {

			inFile = new Scanner(new File(fileName));

			while (inFile.hasNext()) {
				str = inFile.nextLine();
				temp.insert(str);
			}
		} catch (IOException i) {
			System.out.println("Error: " + i.getMessage());
		}
	}

	public void mainMenu(BinarySearchTree root) {
		int choice;

		do {
			System.out.println("\nBST menu\n");
			System.out.println("(1) Load from file");
			System.out.println("(2) Print preorder");
			System.out.println("(3) Print inorder");
			System.out.println("(4) Print postorder");
			System.out.println("(5) Count nodes");
			System.out.println("(6) Count leaves");
			System.out.println("(7) Height");
			System.out.println("(8) Width");
			System.out.println("(9) Clear");
			System.out.println();
			System.out.println("(10) Interchange");
			System.out.println("(11) printLevel");
			System.out.println("(12) isAncestor");
			System.out.println();
			System.out.println("(-1) Quit\n");
			System.out.print("Choice: ");
			choice = console.nextInt();

			System.out.println();
			switch (choice) {
			case 1:
				readData(root);
				break;
			case 2:
				System.out.println();
				System.out.println("The tree preorder\n");
				root.printPreorder();
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println("The tree inorder\n");
				root.printInorder();
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("The tree postorder\n");
				root.printPostorder();
				System.out.println();
				break;
			case 5:
				System.out.println();
				System.out.print("Number of nodes: ");
				System.out.println(root.countNodes() + "\n");
				break;
			case 6:
				System.out.println();
				System.out.print("Number of leaves: ");
				System.out.println(root.countLeaves() + "\n");
				break;
			case 7:
				System.out.println();
				System.out.print("Height of tree: ");
				System.out.println(root.height() + "\n");
				break;
			case 8:
				System.out.println();
				System.out.print("Width of tree: ");
				System.out.println(root.width() + "\n");
				break;
			case 9:
				root.clearTree();
				break;
			case 10:
				root.interchange();
				break;
			case 11:
				System.out.print("Print level: ");
				int level = console.nextInt();
				root.printLevel(level);
				System.out.println();
				break;
			case 12:
				console.nextLine();
				System.out.println("isAncestor: ");
				System.out.print("Enter the ancestor: ");
				String ancestor = console.nextLine();
				System.out.print("Enter the descendant: ");
				String descendant = console.nextLine();
				if (root.isAncestor(ancestor, descendant))
					System.out.println(ancestor + " is an ancestor of " + descendant);
				else
					System.out.println(ancestor + " is not an ancestor of " + descendant);
				System.out.println();
				break;
			default:
				if (choice >= 0)
					System.out.println("Invalid choice!\n");
				break;
			}
		} while (choice >= 0);
	}
	
	public static void main(String[] args) {
		TreeStats ts = new TreeStats();
		BinarySearchTree root = new BinarySearchTree();
		ts.mainMenu(root);
	}
}