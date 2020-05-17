package by.htp.les03.logic;

public class Task13 {
	public static void task() {

		double x1 = 4.0;
		double y1 = 4.0;

		double x2 = -3.0;
		double y2 = 2.0;

		double x3 = 3.0;
		double y3 = -3.0;

		double a1 = Math.abs(x2 - x1);
		double b1 = Math.abs(y2 - y1);
		double c1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));

		double a2 = Math.abs(x3 - x1);
		double b2 = Math.abs(y3 - y1);
		double c2 = Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2));

		double a3 = Math.abs(x3 - x2);
		double b3 = Math.abs(y3 - y2);
		double c3 = Math.sqrt(Math.pow(a3, 2) + Math.pow(b3, 2));

		double p = c1 + c2 + c3;
		double p2 = p / 2;
		double s = Math.sqrt(p2 * (p2 - c1) * (p2 - c2) * (p2 - c3));

		System.out.println("C1 = " + c1 + " C2 = " + c2 + " C3 = " + c3);
		System.out.println("Perimeter = " + p);
		System.out.println("Square = " + s);

	}

}
