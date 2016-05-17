
import gpdraw.*;

@SuppressWarnings("all")
public class Rectangle {
	private double myX;
	private double myY;
	private double myWidth;
	private double myHeight;
	private DrawingTool pen;
	private SketchPad paper;

	public Rectangle() {
		paper = new SketchPad(500, 500);
		pen = new DrawingTool(paper);
	}

	public Rectangle(double x, double y, double width, double height) {
		paper = new SketchPad(500, 500);
		pen = new DrawingTool(paper);
	}

	public double getPerimeter() {
		double perimeter = (myX * 2) + (myY * 2);
		return perimeter;
	}

	public double getArea() {
		double area = myWidth * myHeight;
		return area;
	}

	public void draw() {
		DrawingTool pen;
		pen = new DrawingTool();
		// Get position and width/height
		// Draw rectangle
	}

	public static void main(String[] args) {
		Rectangle rectA = new Rectangle();
		System.out.println("rectA\'s perimeter: " + rectA.getPerimeter());
		System.out.println("rectA\'s area: " + rectA.getArea());

		Rectangle rectB = new Rectangle(0, -80, 400, 160);
		System.out.println("rectB\'s perimeter: " + rectB.getPerimeter());
		System.out.println("rectB\'s area: " + rectB.getArea());
		rectB.draw();

		Rectangle rectC = new Rectangle(-100, -100, 20, 300);
		rectC.draw();
	}
}
