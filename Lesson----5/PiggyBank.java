
import java.util.Scanner;

@SuppressWarnings("all")
public class PiggyBank {
	private int myNumPennies;
	private int newPennies;
	private int myNumNickels;
	private int newNickels;
	private int myNumDimes;
	private int newDimes;
	private int myNumQuarters;
	private int newQuarters;
	private double myPiggyBank;

	PiggyBank() {
		this.myNumPennies = 0;
		this.newPennies = 0;
		this.myNumNickels = 0;
		this.newNickels = 0;
		this.myNumDimes = 0;
		this.newDimes = 0;
		this.myNumQuarters = 0;
		this.newQuarters = 0;
		this.myPiggyBank = 0;
	}

	void appendPennies() {
		this.myNumPennies += this.newPennies;
		this.myPiggyBank += this.newPennies * 1;
	}

	void appendNickels() {
		this.myNumNickels += this.newNickels;
		this.myPiggyBank += this.newNickels * 5;
	}

	void appendDimes() {
		this.myNumDimes += this.newDimes;
		this.myPiggyBank += this.newDimes * 10;
	}

	void appendQuarters() {
		this.myNumQuarters += this.newQuarters;
		this.myPiggyBank += this.newQuarters * 25;
	}

	public int getPennies() {
		return this.myNumPennies;
	}

	public void setPennies(int pennies) {
		this.myNumPennies = pennies;
	}

	public int getNickels() {
		return this.myNumNickels;
	}

	public void setNickels(int nickels) {
		this.myNumNickels = nickels;
	}

	public int getDimes() {
		return this.myNumDimes;
	}

	public void setDimes(int dimes) {
		this.myNumDimes = dimes;
	}

	public int getQuarters() {
		return this.myNumQuarters;
	}

	public void setQuarters(int quarters) {
		this.myNumQuarters = quarters;
	}

	public double getMyPiggyBank() {
		return this.myPiggyBank;
	}

	public void setMyPiggyBank(double myPiggyBank) {
		this.myPiggyBank = myPiggyBank;
	}

	public static void main(String[] args) {

		Scanner in1 = new Scanner(System.in);
		System.out.print("How many pennies do you have? ");
		int newPennies = in1.nextInt();

		Scanner in2 = new Scanner(System.in);
		System.out.print("How many nickels do you have? ");
		int newNickels = in2.nextInt();

		Scanner in3 = new Scanner(System.in);
		System.out.print("How many dimes do you have? ");
		int newDimes = in3.nextInt();

		Scanner in4 = new Scanner(System.in);
		System.out.print("How many quarters do you have? ");
		int newQuarters = in4.nextInt();

		System.out.print("The total value of coins the bank is ");
	}
}
