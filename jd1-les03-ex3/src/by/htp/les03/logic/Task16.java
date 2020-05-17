package by.htp.les03.logic;

public class Task16 {

	public static void task() {
		int x = 7214;
		int x4 = x % 10;
		int x3 = (x / 10) % 10;
		int x2 = (x / 100) % 10;
		int x1 = (x / 1000) % 10;
		int p = x1 * x2 * x3 * x4;

		System.out.println("X4 = " + x4);
		System.out.println("X3 = " + x3);
		System.out.println("X2 = " + x2);
		System.out.println("X1 = " + x1);
		System.out.println("Product = " + p);
	}

}
