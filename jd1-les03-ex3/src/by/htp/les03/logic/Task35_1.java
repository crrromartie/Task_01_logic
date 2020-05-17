package by.htp.les03.logic;

public class Task35_1 {

	public static void task() {
		int m = 911;
		int n = 8;
		double x = (double) m / n;
		System.out.println(x);
		System.out.println("The lower digit of the integer part = " + (int) x % 10);
		System.out.println("The leading digit of the fractional part = " + (int) (x * 10 % 10));
	}

}
