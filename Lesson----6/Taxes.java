
import java.util.Scanner;

@SuppressWarnings("all")
public class Taxes {

	private static Scanner input;

	public static void main(String[] args) {
		print(" === Taxes ===");
		RunMyTaxes();
	}

	private static void RunMyTaxes() {
		input = new Scanner(System.in);
		print("\nWelcome to the MyTaxes program!" + "\nEnter 1 to begin!" + "\nEnter anything else to exit."
				+ "\nYour option:");
		int selection = input.nextInt();
		if (selection == 1) {
			CalculateTaxes();
		} else {
			print("Bye!");
		}
	}

	public static void CalculateTaxes() {
		print("Enter how many hours you worked: ");
		Scanner input1 = new Scanner(System.in);
		Double hours = input1.nextDouble();

		print("Enter your hourly wage: ");
		Scanner input2 = new Scanner(System.in);
		Double wage = input2.nextDouble();

		double gross = (hours * wage);
		double federal = (gross * .154);
		double FICA = (gross * .0775);
		double state = (gross * .04);

		double net = (gross) - (federal + FICA + state);

		print("Gross pay: " + gross + "\nFederal Tax (15.4%): " + federal + "\nFICA Tax (7.75%): " + FICA
				+ "\nState Tax (4.0%): " + state + "\nNet pay: " + net);
	}

	private static void print(String string) {
		System.out.print("\n" + string);
	}
}
