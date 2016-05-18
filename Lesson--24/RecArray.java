import java.io.File;
import java.util.Scanner;
import java.io.IOException;

@SuppressWarnings("all")
class RecArray {

	private final static int NUM = 4;
	private int[][] myGrid = new int[NUM][NUM];

	public RecArray() {
		load();
	}

	public void load() {
		int row, col;
		String fileName = "data2.txt";
		try {
			Scanner inFile = new Scanner(new File(fileName));
			for (row = 0; row < NUM; row++)
				for (col = 0; col < NUM; col++)
					myGrid[row][col] = inFile.nextInt();
		} catch (IOException i) {
			System.out.println("Error: " + i.getMessage());
		}
	}

	public int calculate() {
		return calculate(0);
	}

	public int calculate(int count) {
		if (count >= myGrid.length) {
			return 0;
		} else {
			int total = 0;
			for (int i = 0; i <= count; i++) {
				total += myGrid[count][i];
				total += myGrid[i][count];
			}
			total -= myGrid[count][count];
			System.out.println("count is: " + count + " and this total is: " + total);
			return total + calculate(count + 1);
		}
	}
	
	public long product() {
		return product(0);
	}
	
	public long product(int count) {
		if (count >= myGrid.length) {
			return 1;
		} else {
			long total = 1;
			for (int i = 0; i <= count; i++) {
				total *= myGrid[count][i];
				total *= myGrid[i][count];
			}
			total /= myGrid[count][count];
			System.out.println("count is: " + count + " and this total is: " + total);
			return total * product(count + 1);
		}
	}

	public void display() {
		int row, col;
		for (row = 0; row < NUM; row++) {
			for (col = 0; col < NUM; col++) {
				System.out.print(myGrid[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RecArray app = new RecArray();
		int answer = app.calculate();
		System.out.println("The final answer is: " + answer + "\n");
		long product = app.product();
		System.out.println("The product of the cells using recursion is: " + product);
	}
}
