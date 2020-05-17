package by.htp.les03.logic;

public class Task12 {
	public static void task() {

		double x1 = 10.0;
		double y1 = 5.0;

		double x2 = 15.0;
		double y2 = 10.0;

		double a = Math.abs(x2 - x1);
		double b = Math.abs(y2 - y1);
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.println("Distance = " + c);

	}

}
