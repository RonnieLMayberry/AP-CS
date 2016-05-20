
public class DoublyItem implements Comparable<Object> {
	private int myId;
	private int myInv;

	public DoublyItem(int id, int inv) {
		myId = id;
		myInv = inv;
	}

	public int getId() {
		return myId;
	}

	public int getInv() {
		return myInv;
	}

	public int compareTo(Object other) {
		return myId - ((DoublyItem) other).myId;
	}

	public boolean equals(DoublyItem other) {
		return this.compareTo(other) == 0;
	}

	public String toString() {
		return "Id=" + myId + ",Inv=" + myInv;
	}

}
