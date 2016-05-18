
import gpdraw.*;

public class DrawTool {

	public static void main(String[] args) {
		DrawingTool marker;
		SketchPad poster;

		poster = new SketchPad(600, 600);
		marker = new DrawingTool(poster);

		marker.forward(120);
		marker.turnRight(45);
		marker.forward(80);
		marker.turnLeft(90);
		marker.forward(80);
		marker.turnLeft(90);
		marker.forward(80);
		marker.turnLeft(90);
		marker.forward(80);
	}
}
