package by.htp.les03.logic;

public class Task37_6 {

	public static void task() {
		boolean q = true;
		boolean w = false;
		int a = 7;
		int b = 5;
		int c = 9;

		if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {
			System.out.println("Incorrect entry of the sides of the triangle!");
		} else if (a == b || a == c || c == b) {
			System.out.println(q);
		} else {
			System.out.println(w);
		}
	}

}
