package by.htp.les03.logic;

public class Task38b {

	public static void task() {
		boolean q = true;
		boolean w = false;
		double x = 3;
		double y = -3;

		if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y <= 0 && y >= -3)) {
			System.out.println(q);
		} else {
			System.out.println(w);
		}
	}

}
