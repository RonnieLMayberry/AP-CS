
import java.util.*;
import java.util.Scanner;

@SuppressWarnings("all")
public class StringUtil {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.print(" === StringUtil ===");
		RunStringUtil();
	}

	private static void RunStringUtil() {
		input = new Scanner(System.in);
		System.out.print("\nWelcome to the StringUtil program!" + "\nEnter 1 to reverse a string!"
				+ "\nEnter 2 to check if the string is a palindrome!" + "\nEnter 3 to convert a string into Pig Latin!"
				+ "\nEnter 4 to convert a string into shorthand!" + "\nEnter anything else to exit."
				+ "\nYour option: ");
		int selection = input.nextInt();
		if (selection == 1) {
			ReverseString(null);
		} else if (selection == 2) {
			PalindromeCheck();
		} else if (selection == 3) {
			PigLatin();
		} else if (selection == 4) {
			ShortHand();
		} else {
			System.out.print("Bye!");
		}
	}

	public static void ReverseString(String str) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your string: ");
		java.lang.String reverse = in.nextLine();
		int lengthh = str.length();
		for (int i = lengthh - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("Your string, backwards, is: " + reverse);
	}

	public static void PalindromeCheck() {
		System.out.print("Enter your string: ");
		Scanner input1 = new Scanner(System.in);
		int first = 0;

	}

	public static void PigLatin() {
		System.out.print("Enter your string: ");
		Scanner input1 = new Scanner(System.in);

	}

	public static void ShortHand() {
		System.out.print("Enter your string: ");
		Scanner input1 = new Scanner(System.in);
	}

}
