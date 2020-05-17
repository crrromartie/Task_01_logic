package by.htp.les03.logic;

public class Task38c {
	public static void task() {
		boolean q = true;
		boolean w = false;
		double x = 0.0;
		double y = -5.0;

		if (((x * x + y * y <= 16) && x >= 0 && y >= 0) || ((x * x + y * y <= 25) && x >= 0 && y <= 0)) {
			System.out.println(q);
		} else {
			System.out.println(w);
		}
	}

}
