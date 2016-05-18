

import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class EMDirectoryTest {
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);

		String defaultFileName = "emdir.txt";
		System.out.print("Enter the name of the file to read (enter for " + defaultFileName + "): ");
		String fileName = con.nextLine();

		if (fileName.length() == 0) {
			fileName = defaultFileName;
		}

		EMDirectory dir = new EMDirectory(fileName);

		String name = "";

		while (!name.equals("quit")) {
			System.out.println();
			System.out.print("Enter name (quit to exit): ");
			name = con.nextLine();
			System.out.println();

			if (name.equals("all")) {
				dir.listAll();
			} else if (!name.equals("quit")) {
				int space = name.indexOf(" ");
				if (space > 0) {
					String fName = name.substring(0, space);
					String lName = name.substring(space + 1);
					String emailAddr = (String) dir.lookup(new Name(lName, fName));
					if (emailAddr != null) {
						System.out.println(name + " " + emailAddr);
					} else {
						System.out.println(name + " not found");
					}
				} else {
					Set<?> emailSet = dir.lookupLastName(name);
					if (emailSet.size() > 0) {
						System.out.println(name);
						Iterator<?> iter = emailSet.iterator();
						while (iter.hasNext())
							System.out.println("   " + iter.next());
					} else {
						System.out.println(name + " not found");
					}
				}
			}
		}
		con.close();
	}
}
