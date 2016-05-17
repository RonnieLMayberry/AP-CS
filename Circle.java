
public class Circle {

	private double radius;
	private double area;

	public Circle(double r) {
		radius = r;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double calculateArea(double r) {
		area = 3.14 * (r * r);
		return area;
	}
}