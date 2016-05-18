
import gpdraw.*;

public class Benzene {

	public static void main(String[] args) {
		DrawingTool marker;
		SketchPad poster;

		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);

		marker.up();
		marker.move(0, -175);
		marker.down();
		marker.turnLeft(120);
		marker.forward(175);
		marker.turnLeft(60);
		marker.forward(175);
		marker.turnLeft(60);
		marker.forward(175);
		marker.turnLeft(60);
		marker.forward(175);
		marker.turnLeft(60);
		marker.forward(175);
		marker.turnLeft(60);
		marker.forward(175);
		marker.turnLeft(120);
		marker.up();
		marker.move(0, 0);
		marker.down();
		marker.drawCircle(115);
	}
}
