package by.htp.les03.logic;

public class Task19 {
	public static void task() {
		double a = 8.0;
		double h = Math.sqrt(Math.pow(a, 2) - Math.pow(a / 2, 2));
		double s = a * h / 2;
		double r1 = a / (2 * Math.sqrt(3));
		double r2 = a / Math.sqrt(3);

		System.out.println("H = " + h);
		System.out.println("S = " + s);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);

	}

}
