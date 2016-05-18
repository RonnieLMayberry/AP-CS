
import gpdraw.*;

public class DrawCircles {

	public static void main(String[] args) {
		DrawingTool marker;
		SketchPad poster;

		poster = new SketchPad(600, 600);
		marker = new DrawingTool(poster);

		marker.drawCircle(50);
		marker.drawString("Small");
		marker.up();
		marker.move(0, 120);
		marker.down();
		marker.drawCircle(70);
		marker.drawString("Big");
		marker.up();
		marker.turnLeft(90);
		marker.forward(100);
		marker.down();
		marker.drawCircle(30);
		marker.drawString("Left");
		marker.up();
		marker.turnLeft(180);
		marker.forward(100);
		marker.turnLeft(90);
		marker.forward(110);
		marker.down();
		marker.drawCircle(40);
		marker.drawString("Above");
		marker.up();
		marker.turnLeft(180);
		marker.forward(110);
		marker.turnLeft(90);
		marker.forward(120);
		marker.down();
		marker.drawCircle(50);
		marker.drawString("Right");

	}
}
