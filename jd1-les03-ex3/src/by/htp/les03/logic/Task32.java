package by.htp.les03.logic;

public class Task32 {

	public static void task() {
		int m = 6;
		int n = 30;
		int k = 15;

		int p = 7;
		int q = 45;
		int r = 50;

		m += p;
		n += q;
		k += r;

		m = (m + ((n + (k / 60)) / 60)) % 24;
		n = (n + (k / 60)) % 60;
		k %= 60;
		
		System.out.println(m + "h " + n + "m " + k + "s ");

	}

}
