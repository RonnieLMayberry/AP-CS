
import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("all")
public class LifeGrid {

	final private static int GRIDSIZE = 20;
	private static boolean[][] board = new boolean[GRIDSIZE][GRIDSIZE];
	static int living = 0;
	static int rten = 0;
	static int cten = 0;

	public static void main(String args[]) {
		boolean[][] boardtemp = new boolean[GRIDSIZE][GRIDSIZE];
		char choice;
		int x = 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Start with a (r)andom board? ");
			choice = scanner.next().charAt(0);
		} while (choice != 'r' && choice != 'q');

		clearGrid(board);
		setup(board, choice);

		do {
			System.out.printf("Viewing generation #%d:\n\n", x++);
			displayGrid(board);

			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					boardtemp[row][col] = board[row][col];
				}
			}

			genNextGrid(boardtemp);

			System.out.print("\nNumber of living organisms ---> " + living);
			living = 0;

			System.out.print("\n(q)uit or any other key + ENTER to continue: ");
			choice = scanner.next().charAt(0);

		} while (choice != 'q');

	}

	public static void setup(boolean[][] board, char arr) {
		Random randomNumbers = new Random();

		clearGrid(board);

		if (arr == 'q') {
			board[5][1] = true;
			board[5][2] = true;
			board[6][3] = true;
			board[7][4] = true;
			board[8][4] = true;
			board[9][4] = true;
			board[10][3] = true;
			board[11][2] = true;
			board[11][1] = true;

		} else {
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					if (randomNumbers.nextInt() % 2 == 0)
						board[row][col] = true;
				}
			}
		}
	}

	public static void displayGrid(boolean[][] grid) {
		System.out.print("   ");
		for (int x = 1; x <= grid.length; x++) {
			if ((x / 10) != 0)
				System.out.printf("%d", x / 10);
			else
				System.out.print(" ");
		}

		System.out.println();
		System.out.print("   ");

		for (int x = 1; x <= grid.length; x++) {
			System.out.printf("%d", x % 10);
		}
		System.out.println();

		for (int r = 0; r < grid.length; r++) {
			System.out.printf("%d", r + 1);
			if (r + 1 < 10)
				System.out.print("  ");
			else
				System.out.print(" ");
			for (int c = 0; c < grid.length; c++) {
				if (grid[r][c] == true) {
					System.out.print("*");
					living += 1;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void clearGrid(boolean[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = false;
			}
		}
	}

	public static void genNextGrid(boolean[][] grid) {
		int count = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				count = countNeighbors(grid, row, col);
				if (grid[row][col] == true) {
					if (count < 2 || count > 3)
						board[row][col] = false;
					else
						board[row][col] = true;
				} else {
					if (count == 3)
						board[row][col] = true;
					else
						board[row][col] = false;
				}
			}
		}
	}

	public static int countNeighbors(final boolean[][] grid, final int row, final int col) {
		int count = 0;
		if ((row - 1 >= 0) && (col - 1 >= 0)) {
			if (grid[row - 1][col - 1] == true) {
				count++;
			}
		}
		if (row - 1 >= 0) {
			if (grid[row - 1][col] == true) {
				count++;
			}
		}
		if ((row - 1 >= 0) && (col + 1 < GRIDSIZE)) {
			if (grid[row - 1][col + 1] == true) {
				count++;
			}
		}
		if (col - 1 >= 0) {
			if (grid[row][col - 1] == true) {
				count++;
			}
		}
		if (col + 1 < GRIDSIZE) {
			if (grid[row][col + 1] == true) {
				count++;
			}
		}
		if ((row + 1 < GRIDSIZE) && (col - 1 >= 0)) {
			if (grid[row + 1][col - 1] == true) {
				count++;
			}
		}
		if (row + 1 < GRIDSIZE) {
			if (grid[row + 1][col] == true) {
				count++;
			}
		}
		if ((row + 1 < GRIDSIZE) && (col + 1 < GRIDSIZE)) {
			if (grid[row + 1][col + 1] == true) {
				count++;
			}
		}
		return count;
	}
}
