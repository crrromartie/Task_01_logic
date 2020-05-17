package by.htp.les03.logic;

public class Task22 {

	public static void task() {
		int t = 32045;
		int sec = t % 60;
		int m = t / 60;
		int min = m % 60;
		int h = m / 60;
		System.out.println(h + "h " + min + "m " + sec + "s ");

	}

}
