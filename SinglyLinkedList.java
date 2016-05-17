import java.util.NoSuchElementException;

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

	public Object getLast() {
		if (last == null) {
			throw new NoSuchElementException();
		} else {
			return last.getValue();
		}
	}

	public void addFirst(Object value) {
		first = new ListNode(value, first);
		numNodes++;
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

	public int size() {
		return numNodes;
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
