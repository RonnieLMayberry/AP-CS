
public class DoublyListTest {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.loadData();
		
		System.out.println();
		System.out.println("The ordered list\n");
		list.printList();
		
		System.out.println();
		System.out.println("Number of nodes: " + list.size ());
		System.out.println();
		
		list.printBackwards(list.getFirst2());
		System.out.println();
		
		list.find();
		
		list.remove();
		
		System.out.println();
		System.out.println("The ordered list\n");
		list.printList();
		
		System.out.println();
		System.out.println("Number of nodes: " + list.size ());
		System.out.println();
		
		list.clear();
		System.out.println("List cleared!");
		
		System.out.println();
		System.out.println("Number of nodes: " + list.size ());
	}

}
