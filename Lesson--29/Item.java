
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
	
	public int compareTo(Object other) {
		return myId - ((Item)other).myId;
	}
	
	public boolean equals(Item other) {
		return this.compareTo(other) == 0;
	}
	
	public String toString() {
		return "Id=" + myId + ",Inv=" + myInv;
	}

}
