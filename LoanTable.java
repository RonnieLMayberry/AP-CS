
import java.util.Scanner;

@SuppressWarnings("all")
public class LoanTable {

	public static void main(String[] args) {
		double loanAmount, monthlyPayment, minAnnualInterestRate, maxAnnualInterestRate, monthlyInterestRate, truncVal;
		int numberOfYears;
		System.out.print("Please enter the loan amount: ");
		Scanner input = new Scanner(System.in);
		loanAmount = input.nextDouble();
		System.out.print("Please enter the number of years: ");
		Scanner input2 = new Scanner(System.in);
		numberOfYears = input2.nextInt();
		System.out.println();
		System.out.print("Interest Rate       ");
		System.out.print("Monthly Payment     ");
		System.out.print("Total Payment       ");
		System.out.println();
		System.out.print("-------------       ");
		System.out.print("---------------     ");
		System.out.print("-------------       ");
		System.out.println();
		minAnnualInterestRate = 11.0;
		maxAnnualInterestRate = 12.0;

		for (double rate = minAnnualInterestRate; rate <= maxAnnualInterestRate; rate += 0.125) {
			monthlyInterestRate = rate / 1200;
			System.out.print(rate + "%");
			rate_space(rate);
			monthlyPayment = loanAmount * (monthlyInterestRate)
					/ (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
			truncVal = ((int) (monthlyPayment * 100)) / 100.0;
			System.out.print(truncVal);
			payment_space(truncVal);
			System.out.print((int) (monthlyPayment * 1200 * numberOfYears) / 100.0);
			System.out.println();
		}
	}

	static void rate_space(double value) {
		double frac_val = value - (int) value;
		if (frac_val == 0.0 || frac_val == 0.5)
			System.out.print("  ");
		else if (frac_val == 0.25 || frac_val == 0.75)
			System.out.print(" ");
		else
			System.out.print("");
		System.out.print("              ");
	}

	static void payment_space(double value) {
		if (((((int) (value * 100)) % 10)) == 0)
			System.out.print("               ");
		else
			System.out.print("              ");
	}

}
