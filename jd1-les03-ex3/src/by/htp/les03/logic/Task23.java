package by.htp.les03.logic;

public class Task23 {

	public static void task() {
		double rMin = 5.0;
		double rMax = 8.0;
		double s1 = Math.PI * Math.pow(rMin, 2);
		double s2 = Math.PI * Math.pow(rMax, 2);
		double s = s2 - s1;
		System.out.println("Square ring = " + s);

	}

}
