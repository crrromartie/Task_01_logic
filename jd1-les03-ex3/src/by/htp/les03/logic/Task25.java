package by.htp.les03.logic;

public class Task25 {
	public static void task() {
		double a = 3.0;
		double b = 8.0;
		double c = 2.0;
		double d = Math.pow(b, 2) - (4 * a * c);
		double x1 = (-b - Math.sqrt(d)) / (2 * a);
		double x2 = (-b + Math.sqrt(d)) / (2 * a);
		System.out.println("X1 = " + x1 + " X2 = " + x2);

	}

}
