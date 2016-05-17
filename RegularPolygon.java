
import java.util.Scanner;

@SuppressWarnings("all")
public class RegularPolygon {

	private int myNumSides; // # of sides
	private double mySideLength; // length of side
	private double myr; // radius of inscribed circle
	private double myR; // radius of circumscribed circle

	public static Scanner input;

	// Main

	public static void main(String[] args) {
		print(" === Polygons ===");
		RunMyPolygons();
	}

	// Private Methods

	private static void RunMyPolygons() {
		input = new Scanner(System.in);
		print("\nEnter 1 for Vertex Angle" + "\nEnter 2 for Perimeter" + "\nEnter 3 for Radius of Inscribed Circle"
				+ "\nEnter 4 for Radius of Circumscribed Circle" + "\nEnter 5 for Area");
		int selection = input.nextInt();
		if (selection == 1) {
			print("Enter a number of sides:");
			vertexAngle();
		} else if (selection == 2) {
			Perimeter();
		} else if (selection == 3) {
			getr();
		} else if (selection == 4) {
			getR();
		} else if (selection == 5) {
			Area();
		} else {
			print("Bye!");
		}
	}

	// Public Methods

	public static void vertexAngle() {
		Scanner input = new Scanner(System.in);
		Double n = input.nextDouble();
		print(n + " sides makes the vertex angle " + ((n - 2) / (n) * 180));
		RunMyPolygons();
	}

	public static void Perimeter() {
		print("Enter a number of sides:");
		Scanner input1 = new Scanner(System.in);
		Double n = input1.nextDouble();

		print("Enter the length of the sides:");
		Scanner input2 = new Scanner(System.in);
		Double length = input2.nextDouble();

		double perimeter = (n * length);

		print(n + " sides with lengths of " + length + " makes the perimeter " + perimeter);

		RunMyPolygons();
	}

	public static void getr() {
		print("Enter a number of sides:");
		Scanner input1 = new Scanner(System.in);
		Double n = input1.nextDouble();

		print("Enter the length of a side:");
		Scanner input2 = new Scanner(System.in);
		Double s = input2.nextDouble();

		double radius = ((1 / 2) * s * (1 / Math.tan(Math.PI / n)));

		print(n + " sides with the length of the sides at " + s + " makes the radius of the inscribed circle "
				+ radius);

		RunMyPolygons();
	}

	public static void getR() {
		print("Enter a number of sides:");
		Scanner input1 = new Scanner(System.in);
		Double n = input1.nextDouble();

		print("Enter the length of a side:");
		Scanner input2 = new Scanner(System.in);
		Double s = input2.nextDouble();

		double radius = ((1 / 2) * s * (1 / Math.sin(Math.PI / n)));

		print(n + " sides with the length of the sides at " + s + " makes the radius of the circumscribed circle "
				+ radius);

		RunMyPolygons();
	}

	public static void Area() {
		print("Enter a number of sides:");
		Scanner input1 = new Scanner(System.in);
		Double n = input.nextDouble();

		print("Enter the radius of the circumscribed circle:");
		Scanner input2 = new Scanner(System.in);
		Double R = input.nextDouble();

		double area = ((1 / 2) * n * (R * R) * Math.sin((2 * Math.PI) / (n)));

		print(n + " sides with the radius of the circumscribed circle at " + R + " makes the area " + area);

		RunMyPolygons();
	}

	public static void print(String string) {
		System.out.print("\n" + string);
	}

}
