
import java.util.Scanner;
import java.util.*;

@SuppressWarnings("all")
public class CarRental {

	public static void main(String[] args) {
		System.out.println(" === Car Rental === ");
		RunCarRental();
	}

	private static void RunCarRental() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the make of the car: ");
		java.lang.String make = in.next();

		System.out.println("Enter the model of the car: ");
		java.lang.String model = in.next();

		System.out.println("First three letters of license plate: ");
		java.lang.String license1 = in.next();
		
		System.out.println("I cannot read this message.");

		System.out.println("Remaining digits in license plate: ");
		int license2 = in.nextInt();

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char character1 = license1.charAt(0);
		int ascii1 = character1;

		char character2 = license1.charAt(1);
		int ascii2 = character2;

		char character3 = license1.charAt(2);
		int ascii3 = character3;

		int asciitotal = ascii1 + ascii2 + ascii3;
		int licensetotal = asciitotal + license2;

		int remainder = licensetotal % 26;
		char characterat = alphabet.charAt(remainder);

		System.out.println("\n" + "Make = " + make);
		System.out.println("Model = " + model);
		System.out.println(license1 + " " + license2 + " = " + characterat + licensetotal);
	}

}
