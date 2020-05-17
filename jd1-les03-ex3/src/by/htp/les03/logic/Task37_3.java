package by.htp.les03.logic;

public class Task37_3 {

	public static void task() {
		boolean x = true;
		boolean y = false;

		int n = 222;
		int n1 = n % 10;
		int n2 = n / 10 % 10;
		int n3 = n / 100 % 10;
		int sum = n1 + n2 + n3;
		if (sum % 2 == 0) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}

}
