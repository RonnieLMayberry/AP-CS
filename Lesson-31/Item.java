public class Item implements Comparable<Object> {
	private int myId;
	private int myInv;

	public Item(int id, int inv) {
		myId = id;
		myInv = inv;
	}

	public int getId() {
		return myId;
	}

	public int getInv() {
		return myInv;
	}

	public int compareTo(Object otherObject) {
		Item other = (Item) otherObject;

		return myId - other.myId;
	}

	public boolean equals(Object otherObject) {
		return this.compareTo(otherObject) == 0;
	}

	public String toString() {
		return "Id: " + myId + ",Inv: " + myInv;
	}
}