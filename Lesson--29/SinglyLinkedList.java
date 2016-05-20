import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

@SuppressWarnings("all")
public class SinglyLinkedList {
	private SinglyListNode first, last;

	public SinglyLinkedList() {
		first = null;
		last = null;
	}

	public Object getFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		} else {
			return first.getValue();
		}
	}

	public SinglyListNode getFirst2() {
		return first;
	}

	public void addFirst(Object value) {
		first = new SinglyListNode(value, first);
	}

	public void printList() {
		SinglyListNode temp = first;
		while (temp != null) {
			SinglyItem i = (SinglyItem) (temp.getValue());
			int id1 = i.getId();
			int inv1 = i.getInv();
			System.out.println("Id: " + id1 + ", " + "Inv: " + inv1);
			temp = temp.getNext();
		}
	}

	public void addLast(Object value) {
		if (first != null) {
			SinglyListNode val = new SinglyListNode(value, null);
			last.setNext(val);
			last = val;
		} else {
			SinglyListNode n = new SinglyListNode(value, null);
			first = n;
			last = n;
		}
	}

	public Object getLast() {
		if (first == null) {
			throw new NoSuchElementException();
		} else {
			return last.getValue();
		}
	}

	public int size() {
		int count = 0;
		for (SinglyListNode n = first; n != null; n = n.getNext()) {
			count++;
		}
		return count;
	}

	public void loadData() {
		clear();
		File afile = new File("file20.txt");
		Scanner fromfile = null;
		int id, inv;

		try {
			fromfile = new Scanner(afile);
		} catch (FileNotFoundException e) {
			System.out.println("\nFile not found!\n");
			System.exit(1);
		}
		while (fromfile.hasNext()) {
			id = fromfile.nextInt();
			inv = fromfile.nextInt();
			SinglyItem i = new SinglyItem(id, inv);
			insert(i);
		}
		System.out.println("Loaded.");
	}

	public void insert(SinglyItem value) {
		if (first == null) {
			addFirst(value);
			last = first;
			return;
		}
		SinglyListNode prev = first;
		SinglyListNode curr = first;
		SinglyListNode n = new SinglyListNode(value, null);

		while ((curr != null) && (value.compareTo(curr.getValue()) > 0)) {
			prev = curr;
			curr = curr.getNext();
		}
		if (curr == first) {
			n.setNext(curr);
			first = n;
		} else if (prev == last) {
			prev.setNext(n);
			last = n;
		} else {
			n.setNext(curr);
			prev.setNext(n);
		}
	}

	public void printBackwards(SinglyListNode n) {
		if (n != null) {
			printBackwards(n.getNext());

			SinglyItem i = (SinglyItem) (n.getValue());
			int id = i.getId();
			int inv = i.getInv();
			System.out.println("Id: " + id + ", Inv: " + inv);
		}
	}

	public void find() {
		boolean found = false;
		Scanner keyboard = new Scanner(System.in);
		int id = 0;

		System.out.println();
		System.out.print("Please enter an ID number to search for -> ");
		id = keyboard.nextInt();

		for (SinglyListNode n = first; n != null; n = n.getNext()) {
			Object obj = n.getValue();
			SinglyItem i = (SinglyItem) obj;
			int newid = i.getId();
			if (id == newid) {
				System.out.println("Id: " + newid + " Inv: " + i.getInv());
				System.out.println();
				found = true;
			}
		}

		if (found == false) {
			System.out.println("Id: " + id + " No such part in stock!");
			System.out.println();
		}
	}

	public void remove() {
		int id = 0;
		boolean found = true;
		Scanner keyboard = new Scanner(System.in);

		System.out.println();		
		System.out.print("\nPlease enter an ID number to delete --> ");
		
		id = keyboard.nextInt();
		
		if (first == null) {
			System.out.println("List is empty!");
		}
		
		SinglyListNode prev = first;
		SinglyListNode curr = first;
		
		while ((curr != null) && (id != ((SinglyItem) (curr.getValue())).getId())) {
			prev = curr;
			curr = curr.getNext();
		}
		
		if (curr == null) {
			System.out.println("Id # " + id + "  No such part in stock!");
		}
		
		if (curr == last) {
			prev.setNext(null);
			last = prev;
		} else if (curr == first) {
			first = first.getNext();
			curr.setNext(null);
		} else {
			prev.setNext(curr.getNext());
		}
		
		System.out.println("Id #" + id + " was deleted!");
	}

	public void clear() {
		SinglyListNode n = first;
		while (first != null) {
			n = first;
			first = first.getNext();
			n.setNext(null);
		}
		first = last = null;
	}

	public String toString() {
		String s = "[";

		SinglyListNode temp = first;
		while (temp != null) {
			s += temp.getValue();
			temp = temp.getNext();
			if (temp != null)
				s += ", ";
		}
		s += "]";
		return s;
	}
}