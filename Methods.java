
public class Methods {
	public Methods() {
	}

	public int north(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 - num2 = " + (num1 - num2));
		return (3 * (num1 - num2));
	}

	public double south(double num3, double num4) {
		num3 += 24;
		num4 *= 2;
		System.out.println("num3 / num4 = " + (num3 / num4));
		return (10 * (num3 + num4));
	}
}