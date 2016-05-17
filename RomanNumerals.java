
import java.util.Scanner;

@SuppressWarnings("all")
public class RomanNumerals {

	private static Scanner input;

	public static void main(String[] args) {
		print(" === Roman Numerals === ");
		RunRomanNumerals();
	}

	public static void RunRomanNumerals() {
		input = new Scanner(System.in);
		print("\nWelcome to the Roman Numerals program!" + "\nEnter 1 to convert Arabic to Roman!"
				+ "\nEnter 2 to convert Roman to Arabic!" + "\nEnter anything else to exit." + "\nYour option: ");
		int selection = input.nextInt();
		if (selection == 1) {
			ArabicToRoman();
		} else if (selection == 2) {
			RomanToArabic();
		} else {
			print("Bye!");
		}
	}

	public static void ArabicToRoman() {
		Scanner in = new Scanner(System.in);
		int Arabic = in.nextInt();
		if (Arabic < 1 || Arabic > 3999)
			System.out.print("Invalid.");
		String s = " ";
		while (Arabic >= 1000) {
			s += "M";
			Arabic -= 1000;
		}
		while (Arabic >= 500) {
			s += "D";
			Arabic -= 500;
		}
		while (Arabic >= 100) {
			s += "C";
			Arabic -= 100;
		}
		while (Arabic >= 50) {
			s += "L";
			Arabic -= 50;
		}
		while (Arabic >= 10) {
			s += "X";
			Arabic -= 10;
		}
		while (Arabic >= 5) {
			s += "V";
			Arabic -= 5;
		}
		while (Arabic >= 1) {
			s += "I";
			Arabic -= 1;
		}
	}

	public static void RomanToArabic() {
		Scanner in = new Scanner(System.in);
		int Arabic = in.nextInt();

	}

	private static void print(String string) {
		System.out.print("\n" + string);
	}

}
