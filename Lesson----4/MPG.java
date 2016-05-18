
import java.util.Scanner;

@SuppressWarnings("all")
public class MPG {
	private int myStartMiles; // Starting odometer reading
	private int myEndMiles; // Ending odometer reading
	private double myGallonsUsed; // Gallons of gas used between the readings

	// Creates a new instance of a Car object with the starting odometer
	// readings.
	public MPG(int odometerReading) {
		int x = myStartMiles;
		int y = myEndMiles;
	}

	// Simulates filling up the tank. Record the current odometer reading and
	// the
	// number of gallons to fill the tank.
	public void fillUp(int odometerReading, double gallons) {
	}

	// Calculates and returns the miles per gallon for the car.
	public double calculateMPG() {
		double MPG = (myEndMiles - myStartMiles) / myGallonsUsed;
		return MPG;
	}

	// Resets the myStartMiles to the current odometer reading and resets the
	// gallons
	// used to zero.
	public double resetMPG() {
		double odometerReading = myGallonsUsed;
		int myGallonsUsed = 0;
		return myGallonsUsed;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your starting miles --> ");
		int myStartMiles = in.nextInt();

		Scanner jn = new Scanner(System.in);
		System.out.print("Enter your ending miles --> ");
		int myEndMiles = in.nextInt();

		Scanner on = new Scanner(System.in);
		System.out.print("Enter how many gallons you used --> ");
		int myGallonsUsed = in.nextInt();

		MPG auto = new MPG(myStartMiles);
		System.out.println("Starting odometer: " + myStartMiles);
		System.out.println("Ending odometer: " + myEndMiles);
		System.out.println("Gallons used: " + myGallonsUsed);
		auto.fillUp(150, 8);
		System.out.println("Miles per gallon: " + auto.calculateMPG());
		System.out.println("Miles per gallon: " + auto.calculateMPG());
		auto.resetMPG();
		auto.fillUp(350, 10);
		auto.fillUp(450, 20);
		System.out.println("Miles per gallon: " + auto.calculateMPG());
		auto.resetMPG();
		auto.fillUp(603, 25.5);
		System.out.println("Miles per gallon: " + auto.calculateMPG());

	}
}
