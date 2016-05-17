
import java.util.Scanner;

@SuppressWarnings("all")
public class CheckingAccount {

	private static Double myBalance;
	private static Double deposit;
	private static Double withdraw;
	private static int myAccountNumber;
	private static Scanner input;

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.print("What is the balance of your account? ");
		myBalance = in1.nextDouble();

		if (myBalance < 0) {
			throw new IllegalArgumentException("Negative balance");
		} else {
			Scanner in2 = new Scanner(System.in);
			System.out.print("What is the number of your account? ");
			myAccountNumber = in2.nextInt();
			RunMyGroceries();
		}
	}

	private static void RunMyGroceries() {
		input = new Scanner(System.in);
		System.out.println("\nWelcome to the Checking Account program!" + "\nEnter 1 to see your balance!"
				+ "\nEnter 2 to make a deposit!" + "\nEnter 3 to make a withdraw!" + "\nEnter anything else to exit."
				+ "\nYour option: ");
		int selection = input.nextInt();
		if (selection == 1) {
			getBalance();
			System.out.print("You have $" + myBalance + " in your account.");
			RunMyGroceries();

		} else if (selection == 2) {
			Scanner in3 = new Scanner(System.in);
			System.out.print("How much would you like to deposit? ");
			deposit = in3.nextDouble();

			if (deposit < 0) {
				throw new IllegalArgumentException("Negative amount deposited");
			} else {
				deposit(deposit);
			}

			RunMyGroceries();

		} else if (selection == 3) {
			Scanner in4 = new Scanner(System.in);
			System.out.print("How much would you like to withdraw?");
			withdraw = in4.nextDouble();

			if (withdraw > myBalance) {
				throw new IllegalArgumentException("Amount withdrawn exceeds total balance");
			}

			RunMyGroceries();

		} else {
			System.out.println("Bye!");
		}
	}

	public CheckingAccount() {
		myBalance = 0.0;
		myAccountNumber = 0;
	}

	public CheckingAccount(double initialBalance, int acctNum) {
		myBalance = initialBalance;
		myAccountNumber = acctNum;
	}

	public static double getBalance() {
		return myBalance;
	}

	public static void deposit(double amount) {
		myBalance += amount;
	}

	public static void withdraw(double amount) {
		myBalance -= amount;
	}
}
