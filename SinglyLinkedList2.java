
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList2<E extends Comparable<E>> implements Iterable<E> {
	private ListNode<E> first;
	private ListNode<E> last;

	public SinglyLinkedList2() {
		first = last = null;
	}

	public boolean isEmpty() {
		return true;
	}

	public E getFirst() throws NoSuchElementException {
		if (first == null) {
			throw new NoSuchElementException();
		} else
			return first.getValue();
	}

	public void addFirst(E element) {
		first = new ListNode<E>(element, first);
		if (last == null) {
			last = first;
		}
	}

	public E getLast() throws NoSuchElementException {
		if (last == null) {
			throw new NoSuchElementException();
		} else
			return last.getValue();
	}

	public void addLast(E element) {
		if (first == null) {
			first = last = new ListNode<E>(element, first);
		} else {
			last.setNext(new ListNode<E>(element, null));
			last = last.getNext();
		}
	}

	public void insert(E element) {
		ListNode<E> temp = first, back = null;
		if (first == null) {
			addFirst(element);
			return;
		}
		while (temp != null && element.compareTo(temp.getValue()) > 0) {
			back = temp;
			temp = temp.getNext();
		}
		ListNode<E> toBeAdded = new ListNode<E>(element, temp);
		if (back == null)
			first = toBeAdded;
		else
			back.setNext(toBeAdded);
		if (temp == null)
			last = toBeAdded;
	}

	public E find(E element) {
		for (E elem : this) {
			if (element.equals(elem))
				return elem;
		}
		return null;
	}

	public E remove(E element) {
		ListNode<E> temp = first, back = null;
		while (temp != null && !element.equals(temp.getValue())) {
			back = temp;
			temp = temp.getNext();
		}
		if (temp == null)
			return null;
		else if (back == null) {
			first = temp.getNext();
			return element;
		} else {
			back.setNext(temp.getNext());
			return element;
		}
	}

	public int size() {
		int count = 0;
		for (E elem : this)
			++count;
		return count;
	}

	public void printList() {
		ListNode<E> temp = first;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void printBackwards() {
		printBackwards(first);
	}

	private void printBackwards(ListNode<E> temp) {
		if (temp == null)
			return;
		printBackwards(temp.getNext());
		System.out.println(temp.getValue());
	}

	public void clear() {
		first = last = null;
	}

	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private ListNode<E> temp = first;

			public boolean hasNext() {
				return temp != null;
			}

			public E next() {
				if (!hasNext())
					throw new NoSuchElementException();
				E toReturn = temp.getValue();
				temp = temp.getNext();
				return toReturn;
			}

			public void remove() throws UnsupportedOperationException {
				throw new UnsupportedOperationException();
			}
		};
	}

	public String toString() {

		String s = "[";

		ListNode<E> temp = first;
		while (temp != null) {
			s += temp.getValue() + ", ";
			temp = temp.getNext();
		}
		s += "]";
		return s;
	}
}