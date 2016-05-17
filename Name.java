public class Name implements Comparable<Object> {
	private String lastName;
	private String firstName;

	public Name() {
		this("", "");
	}

	public Name(String last, String first) {
		lastName = last;
		firstName = first;
	}

	public String last() {
		return lastName;
	}

	public String first() {
		return firstName;
	}

	public int compareTo(Object other) {
		Name otherName = (Name) other;

		String lastFirst = last() + first();
		return lastFirst.compareTo(otherName.last() + otherName.first());
	}

	public boolean equals(Object otherObject) {
		return this.compareTo(otherObject) == 0;
	}

	public String toString() {
		return first() + " " + last();
	}
}
