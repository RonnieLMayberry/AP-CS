
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class EMDirectory {
	private Map<Name, String> dir;

	public EMDirectory() {
		dir = new TreeMap<Name, String>();
	}

	public EMDirectory(String dirFile) {
		dir = new TreeMap<Name, String>();

		Scanner in;

		try {
			in = new Scanner(new File(dirFile));
			while (in.hasNext()) {
				String lastName = "";
				String firstName = "";
				String emailAddr = "";
				if (in.hasNext())
					firstName = in.next();
				if (in.hasNext())
					lastName = in.next();
				if (in.hasNext())
					emailAddr = in.next();

				addEntry(new Name(lastName, firstName), emailAddr);
			}
		} catch (IOException i) {
			System.out.println("Error: " + i.getMessage());
		}
	}

	public void addEntry(Name name, String emailAddr) {
		dir.put(name, emailAddr);
	}

	public String lookup(Name name) {
		String name2 = dir.get(name);
		return name2;
	}

	public Set<Object> lookupLastName(String lastName) {
		Name last;
		String last2;
		Set<Object> result = new TreeSet<Object>();
		Set<Name> keys = dir.keySet();

		Iterator<Name> iter = keys.iterator();
		while (iter.hasNext()) {
			last = iter.next();
			last2 = last.last();
			if (last2.equals(lastName)) {
				result.add(dir.get(last));
			} else {
			}
		}
		return result;
	}

	public void listAll() {
		for (Entry<Name, String> entry : dir.entrySet()) {
			Name key = entry.getKey();
			String value = entry.getValue();

			System.out.printf("%s : %s\n", key, value);
		}

	}
}
