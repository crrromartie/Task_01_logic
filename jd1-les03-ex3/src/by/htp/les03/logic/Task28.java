package by.htp.les03.logic;

public class Task28 {

	public static void task() {
		double rad = 1;
		double deg = rad * 180 / Math.PI;
		double min = rad * (60 * 180) / Math.PI;
		double sec = rad * (3600 * 180) / Math.PI;
		System.out.println("Rad = " + rad + "  Deg = " + deg + "  Min = " + min + "  Sec = " + sec);
	}

}
