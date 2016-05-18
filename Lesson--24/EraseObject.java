import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//@SuppressWarnings("all")
public class EraseObject {
	
	private final static int NUM = 20;
	private int[][] myGrid = new int[NUM][NUM];
	
	public EraseObject() {
		load();
	}
	
	public void load() {
		int row, col = 0;
		String fileName = "digital.txt";
		try {
			Scanner inFile = new Scanner(new File(fileName));
			int i, j;
			while(inFile.hasNextInt()){
					col = inFile.nextInt()-1;
					row = inFile.nextInt()-1;
					myGrid[row][col] = '@';
			}
			for (i = 0; i < NUM; i++) {
				for (j = 0; j < NUM; j++) {
					if (myGrid[i][j] != '@') {
						myGrid[i][j] = '-';
					} else {}
				}
			}
			inFile.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void displayGrid(int[][] grid) {
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
				if (myGrid[c][r] == '-')
					System.out.print("-");
				else if (myGrid[c][r] == '@')
					System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public int[][] erase(int y, int x) {
		if (myGrid[y][x] == '@') {
			myGrid[y][x] = '-';
			
			if (myGrid[y-1][x] == '@') {
				erase(y-1, x);
			}
			if (myGrid[y][x-1] == '@') {
				erase(y, x-1);
			}
			if (myGrid[y+1][x] == '@') {
				erase(y+1, x);
			}
			if (myGrid[y][x+1] == '@') {
				erase(y, x+1);
			}
			
		} else { }
		return myGrid;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("(ROW) Enter a starting coordinate for erasure: ");
		int y = in.nextInt();
		System.out.println("(COL) Enter a starting coordinate for erasure: ");
		int x = in.nextInt();
		in.close();
		
		EraseObject object = new EraseObject();
		int[][] grid = object.erase(y, x);
		object.displayGrid(grid);
	}
}
