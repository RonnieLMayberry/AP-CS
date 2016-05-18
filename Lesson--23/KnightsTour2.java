
public class KnightsTour2 {
	private static final int N = 8;
	private int board[][];

	public KnightsTour2() {
		board = new int[N][N];
	}

	private boolean isCorrect(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1)
			return true;
		return false;
	}

	private void printSuccess() {
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				System.out.print("  \t" + board[x][y]);
			}
			System.out.println();
		}
	}

	private boolean solveKTour(int x, int y, int iMove, int xMove[], int yMove[]) {
		int i, next_x, next_y;
		if (iMove == N * N)
			return true;

		for (i = 0; i < N; i++) {
			next_x = x + xMove[i];
			next_y = y + yMove[i];
			if (isCorrect(next_x, next_y)) {
				board[next_x][next_y] = iMove;
				if (solveKTour(next_x, next_y, iMove + 1, xMove, yMove))
					return true;
				else
					board[next_x][next_y] = -1;
			}
		}
		return false;
	}

	public boolean solveKnightsTour() {
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				board[x][y] = -1;
			}
		}
		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
		board[0][0] = 0;
		if (!solveKTour(0, 0, 1, xMove, yMove)) {
			System.out.println("The knight was unsuccessful... (try again!)");
			return false;
		} else {
			printSuccess();
		}
		return true;
	}

	public static void main(String args[]) {
		KnightsTour2 knightTour = new KnightsTour2();
		System.out.println("The knight was successful! (0 -> 63)");
		knightTour.solveKnightsTour();
	}
}
