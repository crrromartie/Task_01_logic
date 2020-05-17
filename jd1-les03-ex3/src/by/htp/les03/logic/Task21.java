package by.htp.les03.logic;

public class Task21 {

	public static void task() {
		double x = 456.879;
		double y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println("Y = " + y);
	}

}
