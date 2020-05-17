package by.htp.les03.logic;

public class Task37_5 {

	public static void task() {
		boolean q = true;
		boolean w = false;
		int n = 145;
		int n1 = n % 10;
		int n2 = n / 10 % 10;
		int n3 = n / 100 % 10;
		int sum = n1 + n2 + n3;

		if (Math.pow(n, 2) == Math.pow(sum, 3)) {
			System.out.println(q);
		} else {
			System.out.println(w);
		}

	}

}
