
public class SinglyListNode {
	private Object value;
	private SinglyListNode next;

	public SinglyListNode(Object initValue, SinglyListNode initNext) {
		value = initValue;
		next = initNext;
	}

	public SinglyListNode(Object initValue) {
		this(initValue, null);
	}

	public void setValue(Object theNewValue) {
		value = theNewValue;
	}

	public void setNext(SinglyListNode theNewNext) {
		next = theNewNext;
	}

	public Object getValue() {
		return value;
	}

	public SinglyListNode getNext() {
		return next;
	}
}
