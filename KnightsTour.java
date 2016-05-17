
import java.util.Scanner;

@SuppressWarnings("all")
public class KnightsTour {

	private int[][] myBoard;
	private int myRow;
	private int myCol;
	private int myCount;
	private static final int[] horizontal = { 1, 2, 2, 1, -1, -2, -2, -1 };
	private static final int[] vertical = { -2, -1, 1, 2, 2, 1, -1, -2 };

	public KnightsTour() {
		myBoard = new int[8][8];
		myRow = 0;
		myCol = 0;
		myCount = 0;
		myBoard[0][0] = 1;
	}

	public boolean canMove(int row, int col) {
		if (row < 8 && row >= 0 && col < 8 && col >= 0) {
			if (myBoard[row][col] == 0)
				return true;
		}
		return false;
	}

	public void move() {
		int rand = (int) (Math.random() * 8);
		int newRow = myRow + horizontal[rand];
		int newCol = myCol + vertical[rand];

		while (!canMove(newRow, newCol)) {
			rand = (int) (Math.random() * 8);
			newRow = myRow - horizontal[rand];
			newCol = myCol - vertical[rand];
		}
		myRow = newRow;
		myCol = newCol;
		myCount++;
		myBoard[myRow][myCol] = myCount;
	}

	public boolean noMoreMoves() {
		for (int i = 0; i < 7; i++) {
			if (canMove(myRow + horizontal[i], myCol + vertical[i]))
				return false;
		}
		return true;
	}

	public void print() {
		for (int row = 0; row < myBoard.length; row++) {
			for (int col = 0; col < myBoard[row].length; col++) {
				System.out.print(myBoard[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println(myCount + " squares were visited.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		KnightsTour knight = new KnightsTour();
		while (!knight.noMoreMoves())
			knight.move();
		knight.print();
	}
}
