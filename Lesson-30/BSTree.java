
import java.util.Scanner;
import java.io.*;

public class BSTree {
	private static Scanner console = new Scanner(System.in);

	public static void readData(BinarySearchTree temp) {
		Scanner inFile;

		String fileName = "file20.txt";
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

	public static void mainMenu(BinarySearchTree root) {
		String choice;
		do {
			System.out.println("BSTree Menu\n");
			System.out.println("(1) Load from file");
			System.out.println("(2) Print inorder");
			System.out.println("(3) Count");
			System.out.println("(Q) Quit\n");
			System.out.print("Choice ---> ");
			choice = console.nextLine() + " ";
			System.out.println();

			if ('1' <= choice.charAt(0) && choice.charAt(0) <= '3') {
				switch (choice.charAt(0)) {
				case '1':
					readData(root);
					break;
				case '2':
					System.out.println();
					System.out.println("The tree inorder\n");
					System.out.printf("%10s%10s", "Id", "Inv");
					System.out.println();
					root.print();
					System.out.println();
					break;
				case '3':
					System.out.println("Number of nodes: " + root.countNodes());
					System.out.println();
					break;
				}
			}
		} while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
	}
	
	public static void main(String[] args) {
		BinarySearchTree root = new BinarySearchTree();
		mainMenu(root);
	}
}