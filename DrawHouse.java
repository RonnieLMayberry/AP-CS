
import gpdraw.*;

public class DrawHouse {

	public static void main(String[] args) {
		DrawingTool marker;
		SketchPad poster;

		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);

		marker.up();
		marker.move(-200, -200);
		marker.down();
		marker.turnRight(135);
		marker.forward(200);
		marker.turnRight(90);
		marker.forward(400);
		marker.turnRight(90);
		marker.forward(200);
		marker.turnRight(90);
		marker.forward(400);
		marker.turnRight(90);
		marker.forward(200);
		marker.turnRight(65);
		marker.forward(225);
		marker.turnRight(51);
		marker.forward(218);
		marker.turnRight(154);
		marker.forward(160);
		marker.up();
		marker.turnLeft(90);
		marker.forward(100);
		marker.down();
		marker.forward(100);
		marker.turnRight(90);
		marker.forward(80);
		marker.turnRight(90);
		marker.forward(100);
		marker.turnRight(90);
		marker.forward(80);
		marker.up();
		marker.forward(40);
		marker.turnLeft(90);
		marker.forward(20);
		marker.down();
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.up();
		marker.forward(160);
		marker.down();
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.turnRight(90);
		marker.forward(60);
		marker.turnLeft(90);
		marker.up();
		marker.forward(50);
		marker.turnRight(90);
		marker.forward(70);
		marker.down();
		marker.forward(10);
		marker.turnLeft(90);
		marker.forward(10);
		marker.turnLeft(90);
		marker.forward(10);
		marker.turnLeft(90);
		marker.forward(10);

	}
}
