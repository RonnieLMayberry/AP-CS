
public class MethodsDriver {
	public static void main(String[] args) {
		Methods app = new Methods();
		int a = 40, b = 25;
		double c = 13, d = -2;
		System.out.println("To start, a - b = " + (a - b));
		int hello = app.north(a, b);
		System.out.println("Now, a - b = " + (a - b));
		System.out.println("north returned " + hello);
		System.out.println("c / d = " + c / d);
		double goodbye = app.south(c, d);
		System.out.println("Now, c / d = " + c / d);
		System.out.println("south returned " + goodbye);
	}
}
