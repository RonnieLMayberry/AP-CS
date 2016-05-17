
@SuppressWarnings("all")
public class MagicSquare {

	public static boolean validateSquare(int[][] square, int expectedSum) {
		int sum;
		for (int i = 0; i < square.length; i++) {
			sum = 0;
			for (int j = 0; j < square[i].length; j++)
				sum += square[i][j];
			if (sum != expectedSum)
				return false;
		}

		for (int i = 0; i < square.length; i++) {
			sum = 0;
			for (int j = 0; j < square[i].length; j++)
				sum += square[j][i];
			if (sum != expectedSum)
				return false;
		}

		sum = 0;
		for (int i = 0; i < square.length; i++)
			sum += square[i][i];
		if (sum != expectedSum)
			return false;

		sum = 0;
		for (int i = square.length - 1; i >= 0; i--)
			sum += square[i][i];
		if (sum != expectedSum)
			return false;

		return true;
	}

	public static void main(String[] args) {
		//validateSquare();
	}
}
