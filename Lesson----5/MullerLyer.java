
import gpdraw.*;

public class MullerLyer {

	public static void main(String[] args) {
		DrawingTool marker;
		SketchPad poster;

		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);

		marker.down();
		marker.turnRight(110);
		marker.forward(15);
		marker.turnRight(140);
		marker.forward(15);
		marker.turnLeft(180);
		marker.forward(15);
		marker.turnRight(20);
		marker.forward(50);
		marker.turnLeft(20);
		marker.forward(15);
		marker.turnLeft(-180);
		marker.forward(15);
		marker.turnLeft(130);
		marker.forward(15);
		marker.up();
		marker.move(8, 50);
		marker.down();
		marker.turnRight(120);
		marker.forward(15);
		marker.turnRight(180);
		marker.forward(15);
		marker.turnLeft(130);
		marker.forward(15);
		marker.turnLeft(180);
		marker.forward(15);
		marker.turnRight(148);
		marker.forward(60);
		marker.turnLeft(158);
		marker.forward(15);
		marker.turnLeft(180);
		marker.forward(15);
		marker.turnRight(130);
		marker.forward(15);
	}
}
