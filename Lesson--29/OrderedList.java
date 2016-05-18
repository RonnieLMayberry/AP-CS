import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderedList {
	public static void main(String[] args) {
		OrderedList bringorder = new OrderedList();
		bringorder.mainMenu();
	}

	public void mainMenu() {
		SinglyLinkedList list = new SinglyLinkedList();

		String choice;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Linked List Menu\n"		);
			System.out.println("(1) Load"				);
			System.out.println("(2) Print list"			);
			System.out.println("(3) Find from list"		);
			System.out.println("(4) Remove from list"	);
			System.out.println("(5) Clear List"			);
			System.out.println("(6) Count Nodes"		);
			System.out.println("(7) Print Backwards"	);
			System.out.println("(Q) Quit"				);
			System.out.println("Choice ---> "			);
			try {
				choice = in.nextLine();
			} catch (NoSuchElementException e) {
				choice = "Q";
			}
			System.out.println();

			if ('1' <= choice.charAt(0) && choice.charAt(0) <= '7') {
				switch (choice.charAt(0)) {
				case '1':
					list.loadData();
					break;
				case '2':
					System.out.println();
					System.out.println("The ordered list\n");
					list.printList();
					System.out.println();
					break;
				case '3':
					list.find();
					break;
				case '4':
					list.remove();
					break;
				case '5':
					list.clear();
					break;
				case '6':
					System.out.println("Number of nodes: " + list.size());
					System.out.println();
					break;
				case '7':
					list.printBackwards(list.getFirst2());
					System.out.println();
					break;
				}
			}
		} while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
		in.close();
	}
}
