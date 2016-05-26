import java.util.Scanner;
import java.io.*;

public class BSTree {
	private Scanner console;

	public BSTree() {
		console = new Scanner(System.in);
	}

	void testFind(BinarySearchTree temp) {
		int idToFind;
		Item location;

		System.out.println("Testing search\n");
		System.out.print("Enter Id to find (-1 to quit): ");
		idToFind = console.nextInt();

		while (idToFind >= 0) {
			location = (Item) temp.find(new Item(idToFind, 0));
			if (location == null)
				System.out.println("Id: " + idToFind + "  Not in stock");
			else
				System.out.println("Id: " + location.getId() + "  Inv: " + location.getInv());
			System.out.println();
			System.out.print("Enter Id to find (-1 to quit): ");
			idToFind = console.nextInt();
		}
	}

	public void testDelete(BinarySearchTree temp) {
		int idToDelete;

		System.out.println("Testing delete\n");
		System.out.print("Enter Id to delete (-1 to quit): ");
		idToDelete = console.nextInt();

		while (idToDelete >= 0) {
			Item dNode = new Item(idToDelete, 0);

			if (temp.find(dNode) == null)
				System.out.println("Id: " + idToDelete + "  Not in stock");
			else {
				temp.delete(dNode);
				System.out.println("     Id: " + idToDelete + " was deleted");
			}
			System.out.println();
			System.out.print("Enter Id to delete (-1 to quit): ");

			idToDelete = console.nextInt();
		}
	}

	public void readData(BinarySearchTree temp) {
		Scanner inFile;

		String fileName = "file20";
		int id, inv;
		try {
			inFile = new Scanner(new File(fileName));
			while (inFile.hasNext()) {
				id = inFile.nextInt();
				inv = inFile.nextInt();
				temp.insert(new Item(id, inv));
			}
		} catch (IOException i) {
			System.out.println("Error: " + i.getMessage());
		}
	}

	public void mainMenu(BinarySearchTree root) {
		String choice;
		do {
			System.out.println("BST Menu\n");
			System.out.println("(1) Load data");
			System.out.println("(2) Print inorder");
			System.out.println("(3) Find");
			System.out.println("(4) Delete");
			System.out.println("(5) Count nodes");
			System.out.println("(Q) Quit\n");
			System.out.print("Choice: ");
			choice = console.nextLine() + " ";
			System.out.println();

			if ('1' <= choice.charAt(0) && choice.charAt(0) <= '5') {
				switch (choice.charAt(0)) {
				case '1':
					readData(root);
					break;
				case '2':
					System.out.println();
					System.out.println("The tree inorder\n");
					System.out.printf("%10s%10s", "Id", "Inv");
					System.out.println();
					root.printInorder();
					System.out.println();
					break;
				case '3':
					testFind(root);
					break;
				case '4':
					testDelete(root);
					break;
				case '5':
					System.out.println("Number of nodes: " + root.countNodes());
					System.out.println();
					break;
				}
			}
		} while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
	}
	
	public static void main(String[] args) {
		BSTree btree = new BSTree();
		BinarySearchTree root = new BinarySearchTree();
		btree.mainMenu(root);
	}
}