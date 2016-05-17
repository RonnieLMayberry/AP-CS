
import java.util.Scanner;

@SuppressWarnings("all")
public class GroceryList {

	private static Scanner input;

	public static void main(String[] args) {
		print(" === Groceries ===");
		RunMyGroceries();
	}

	private static void RunMyGroceries() {
		input = new Scanner(System.in);
		print("\nWelcome to the MyGroceries program!" + "\nEnter 1 to begin!" + "\nEnter anything else to exit."
				+ "\nYour option: ");
		int selection = input.nextInt();
		if (selection == 1) {
			CalculateGroceries();
		} else {
			print("Bye!");
		}
	}

	public static void CalculateGroceries() {
		print("Enter grocery item #1: ");
		Scanner input1 = new Scanner(System.in);
		Double price1 = input1.nextDouble();

		print("Enter grocery item #2: ");
		Scanner input2 = new Scanner(System.in);
		Double price2 = input2.nextDouble();

		print("Enter grocery item #3: ");
		Scanner input3 = new Scanner(System.in);
		Double price3 = input3.nextDouble();

		print("Enter grocery item #4: ");
		Scanner input4 = new Scanner(System.in);
		Double price4 = input4.nextDouble();

		print("Enter grocery item #5: ");
		Scanner input5 = new Scanner(System.in);
		Double price5 = input5.nextDouble();

		double FirstPrice = (price1);
		double SecondPrice = (FirstPrice + price2);
		double ThirdPrice = (SecondPrice + price3);
		double FourthPrice = (ThirdPrice + price4);
		double FifthPrice = (FourthPrice + price5);

		System.out.printf("%-10s %-10s %-10s\n", "Item:", "Cost:", "Total:");
		System.out.printf("%-10s %-10s %-10s\n", "#1", price1, FirstPrice);
		System.out.printf("%-10s %-10s %-10s\n", "#2", price2, SecondPrice);
		System.out.printf("%-10s %-10s %-10s\n", "#3", price3, ThirdPrice);
		System.out.printf("%-10s %-10s %-10s\n", "#4", price4, FourthPrice);
		System.out.printf("%-10s %-10s %-10s\n", "#5", price5, FifthPrice);
	}

	private static void print(String string) {
		System.out.print("\n" + string);
	}

}
