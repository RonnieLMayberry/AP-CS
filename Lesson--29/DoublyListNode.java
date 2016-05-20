
public class DoublyListNode {
	private Object value;
	private DoublyListNode next;

	public DoublyListNode(Object initValue, DoublyListNode initNext) {
		value = initValue;
		next = initNext;
	}

	public DoublyListNode(Object initValue) {
		this(initValue, null);
	}

	public void setValue(Object theNewValue) {
		value = theNewValue;
	}

	public void setNext(DoublyListNode theNewNext) {
		next = theNewNext;
	}

	public Object getValue() {
		return value;
	}

	public DoublyListNode getNext() {
		return next;
	}
}
