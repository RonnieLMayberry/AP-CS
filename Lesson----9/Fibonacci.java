
import java.util.Scanner;

@SuppressWarnings("all")
public class Fibonacci {
	
	private static Scanner input;

	public static void main(String[] args) {
		print("=== Fibonacci ===");
		RunFibonacci();
	}
	
	private static void RunFibonacci() {
		input = new Scanner(System.in);
		print(	"\nWelcome to the Fibonacci program!"
				+ "\nEnter 1 to see the Fibonacci number of your integer."
				+ "\nEnter 2 to solve a multiplication problem recursively."
				+ "\nEnter anything else to exit." + "\nYour option: ");
		
		int selection = input.nextInt();
		
		if (selection == 1) {
			int n;
			print("Enter an integer: ");
			Scanner input1 = new Scanner(System.in);
			n = input1.nextInt();
			fibnum(n);
			
		} else if (selection == 2) {
//			multx();
			
		} else {
			print("Bye!");
		}
	}
	
	public static int fibnum(int n) {
		if (0 == n || 1 == n) {
			System.out.print(n);
			return n;
		} else {
			n = fibnum(n-2) + fibnum(n-1);
			return fibnum(n);
		}
	}
	
//	public static int multx(); {
//		
//	}
	
	private static void print(String string) {
        System.out.print("\n" + string);
    }

}
