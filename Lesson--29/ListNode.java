
public class ListNode {
	private Object value;
	private ListNode next;

	public ListNode(Object initValue, ListNode initNext) {
		value = initValue;
		next = initNext;
	}

	public ListNode(Object initValue) {
		this(initValue, null);
	}

	public void setValue(Object theNewValue) {
		value = theNewValue;
	}

	public void setNext(ListNode theNewNext) {
		next = theNewNext;
	}

	public Object getValue() {
		return value;
	}

	public ListNode getNext() {
		return next;
	}
}
