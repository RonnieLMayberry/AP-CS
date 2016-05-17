import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SinglyLinkedList {
	private ListNode first, last;
	private int numNodes;

	public SinglyLinkedList() {
		first = null;
		last = null;
		numNodes = 0;
	}

	public Object getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		else
			return first.getValue();
	}

	public void addFirst(Object value) {
		first = new ListNode(value, first);
		numNodes++;
	}

	public Object getLast() {
		if (last == null) {
			throw new NoSuchElementException();
		} else {
			return last.getValue();
		}
	}

	public void addLast(Object value) {
		if (first == null) {
			first = new ListNode(value, first);
			last = first;
		} else {
			ListNode newLast = new ListNode(value, null);
			last.setNext(newLast);
			last = newLast;
		}
		numNodes++;
	}

	public void insert(Item value) {
		boolean found = false;
		if (first == null) {
			addFirst(value);
			last = first;
			return;
		}
		ListNode prev = first;
		ListNode curr = first;
		ListNode n = new ListNode(value, null);
		
		while((curr != null) && (value.compareTo(curr.getValue()) > 0)) {
			prev = curr;
			curr = curr.getNext();
		} if (curr == first) {
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

	public ListNode find(Object value) {
		return null;
	}

	public void remove() {
// https://github.com/kongd/APCS/blob/master/SinglyLinkedList.java
	}

	public int size() {
		return numNodes;
	}

	public void clear() {

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
			Item i = new Item(id, inv);
			insert(i);
		}
	}

	public void printBackward() {

	}

	public void printList() {
		ListNode temp = first;
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}
	}

	public String toString() {
		String s = "[";

		ListNode temp = first;
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
