
import java.util.Scanner;
import java.lang.Math;

@SuppressWarnings("all")
public class MyMath {

	public static void main(String[] args) {
		print(" === MyMath ===");
		MyMath();
	}

	private static void MyMath() {
		Scanner input = new Scanner(System.in);
		print("\nEnter 1 for Fahrenheit to Celsius" + "\nEnter 2 for Celsius to Fahrenheit"
				+ "\nEnter 3 for Sphere Volume" + "\nEnter 4 for Hypotenuse" + "\nEnter 5 for Real Roots"
				+ "\nEnter something else to exit." + "\nYour option:");
		int selection = input.nextInt();
		if (selection == 1) {
			print("Enter a degree in Fahrenheit:");
			fToC();
		} else if (selection == 2) {
			print("Enter a degree in Celsius:");
			cToF();
		} else if (selection == 3) {
			print("Enter the radius of a sphere:");
			SphereVol();
		} else if (selection == 4) {
			TriHyp();
		} else if (selection == 5) {
			RealRoots();
		} else {
			print("Bye!");
		}
	}

	private static void cToF() {
		Scanner input = new Scanner(System.in);
		Double celsius = input.nextDouble();
		print(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32) + " Fahrenheit.");
		MyMath();
	}

	private static void fToC() {
		Scanner input = new Scanner(System.in);

		Double Fahrenheit = input.nextDouble();
		print(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0)) + " celsius.");
		MyMath();
	}

	private static void SphereVol() {
		Scanner input = new Scanner(System.in);

		Double radius = input.nextDouble();
		print(radius + " as a radius outputs " + ((4 / 3) * (Math.PI) * (radius * radius * radius)) + " volume.");
		MyMath();
	}

	private static void TriHyp() {
		print("Enter the first side length:");
		Scanner input1 = new Scanner(System.in);
		Double side1 = input1.nextDouble();

		print("Enter the second side length:");
		Scanner input2 = new Scanner(System.in);
		Double side2 = input2.nextDouble();

		Double a2b2 = (side1 * side1) * (side2 * side2);

		print(side1 + " and " + side2 + " makes the hypotenuse " + (Math.sqrt(a2b2)));

		MyMath();
	}

	private static void RealRoots() {
		print("Enter three coefficients: ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double root1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		double root2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		print("The first root is: " + root1);
		print("The second root is: " + root2);
		print("NaN means that the root is non-real!");

		MyMath();
	}

	private static void print(String string) {
		System.out.print("\n" + string);
	}
}
