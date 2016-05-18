import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SinglyLinkedList {
	private ListNode first, last;

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

	public ListNode getFirst2() {
		return first;
	}

	public void addFirst(Object value) {
		first = new ListNode(value, first);
	}

	public void printList() {
		ListNode temp = first;
		while (temp != null) {
			Item i = (Item) (temp.getValue());
			int id1 = i.getId();
			int inv1 = i.getInv();
			System.out.println("Id: " + id1 + ", " + "Inv: " + inv1);
			temp = temp.getNext();
		}
	}

	public void addLast(Object value) {
		if (first != null) {
			ListNode val = new ListNode(value, null);
			last.setNext(val);
			last = val;
		} else {
			ListNode n = new ListNode(value, null);
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
		for (ListNode n = first; n != null; n = n.getNext()) {
			count++;
		}
		return count;
	}

	public void loadData() {
		clear();
		File afile = new File("file20");
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
		System.out.println("Loaded.");
	}

	public void insert(Item value) {
		if (first == null) {
			addFirst(value);
			last = first;
			return;
		}
		ListNode prev = first;
		ListNode curr = first;
		ListNode n = new ListNode(value, null);

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

	public void printBackwards(ListNode n) {
		if (n != null) {
			printBackwards(n.getNext());

			Item i = (Item) (n.getValue());
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
		while (true) {
			found = false;
			System.out.print("Please enter an ID number to search for (-1 to quit); -> ");
			id = keyboard.nextInt();
			if (id == -1) {
				System.out.println("Quitting...\n");
				break;
			}
			for (ListNode n = first; n != null; n = n.getNext()) {
				Object obj = n.getValue();
				Item i = (Item) obj;
				int newid = i.getId();
				if (id == newid) {
					System.out.println("Id: " + newid + " Inv: " + i.getInv());
					System.out.println();
					found = true;
					break;
				}
			}
			if (found == false) {
				System.out.println("Id: " + id + " No such part in stock!");
				System.out.println();
			}
		}
		keyboard.close();
	}

	public void remove() {
		int id = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		while (true) {
			System.out.print("\nPlease enter an ID number to delete (-1 to quit): ");
			id = keyboard.nextInt();
			if (id == -1) {
				System.out.println();
				break;
			}
			if (first == null) {
				System.out.println("List is empty!");
				continue;
			}
			ListNode prev = first;
			ListNode curr = first;
			while ((curr != null) && (id != ((Item) (curr.getValue())).getId())) {
				prev = curr;
				curr = curr.getNext();
			}
			if (curr == null) {
				System.out.println("Id # " + id + "  No such part in stock!");
				continue;
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
		keyboard.close();
	}

	public void clear() {
		ListNode n = first;
		while (first != null) {
			n = first;
			first = first.getNext();
			n.setNext(null);
		}
		first = last = null;
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
