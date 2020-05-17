package by.htp.les03.logic;

public class Task24 {
	public static void task() {
		double b = 12.0;
		double a = 20.0;
		double angle = 1.0472;
		double a1 = (a - b) / 2;
		double h = a1 * Math.tan(angle);
		double s = (a + b) / 2 * h;
		System.out.println("S = " + s);

	}

}
