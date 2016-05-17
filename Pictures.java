
import java.util.Scanner;
import gpdraw.*;
import java.util.Random;
import java.awt.Color;

@SuppressWarnings("all")
public class Pictures {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		printMultTable(n);
		printStarPyramid();

		Pictures sunny = new Pictures();
		sunny.drawSunburst();
	}

	public static void printMultTable(int x) {
		int width = (int) Math.floor(Math.log10(x * x)) + 2;
		StringBuilder b = new StringBuilder(x * width);
		for (int row = 1; row <= x; row++) {
			b.setLength(0);
			for (int col = 1; col <= x; col++) {
				b.append(String.format("%" + width + "d", row * col));
			}
			System.out.println(b);
		}
	}

	public static void printStarPyramid() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void drawSunburst() {
		DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
		for (int p = 1; p <= 360; p++) {
			Random r = new Random();
			Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
			pen.setColor(c);
			pen.forward(200);
			pen.backward(200);
			pen.turnRight(1);
		}
	}
}
