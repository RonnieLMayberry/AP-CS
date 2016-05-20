
public class SinglyItem implements Comparable<Object> {
	private int myId;
	private int myInv;

	public SinglyItem(int id, int inv) {
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
		return myId - ((SinglyItem) other).myId;
	}

	public boolean equals(SinglyItem other) {
		return this.compareTo(other) == 0;
	}

	public String toString() {
		return "Id=" + myId + ",Inv=" + myInv;
	}

}
