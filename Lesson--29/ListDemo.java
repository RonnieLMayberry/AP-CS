
public class ListDemo {
	SinglyLinkedList myList;

	public ListDemo() {
		myList = new SinglyLinkedList();
	}

	public void createList(int num) {
		for (int k = 1; k <= num; k++) {
			myList.addLast(new Integer(k));
		}
	}

	public void displayFirst() {
		System.out.println("First Element: " + myList.getFirst());
	}
	
	public void displayLast() {
		System.out.println("Last Element: " + myList.getLast());
	}

	public void printList() {
		System.out.print("SinglyLinkedList: ");
		myList.printList();
		System.out.println();
	}
	
	public void size() {
		System.out.println("Nodes: " + myList.size());
	}
	
	public String toString() {
		return myList.toString();
	}
	
	public static void main(String[] args) {
		ListDemo nList = new ListDemo();
		
		nList.createList(20);
		nList.displayFirst();
		nList.displayLast();
		nList.printList();
		nList.size();
	}
}
