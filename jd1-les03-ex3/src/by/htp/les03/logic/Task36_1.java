package by.htp.les03.logic;

public class Task36_1 {

	public static void task() {
		int number = 4589; 
		int x1 = number % 10;
		int x2 = number / 10 % 10;
		int x3 = number / 100 % 10;
		int x4 = number / 1000 % 10;
		System.out.println("Initial number = " + number);

		int p1 = 1;
		int p2 = 1;

		if (x1 % 2 == 0) {
			p1 *= x1;
		} else {
			p2 *= x1;
		}
		
		if (x2 % 2 == 0) {
			p1 *= x2;
		} else {
			p2 = p2 * x2;
		}
		
		if (x3 % 2 == 0) {
			p1 *= x3;
		} else {
			p2 *= x3;
		}

		if (x4 % 2 == 0) {
			p1 *= x4;
		} else {
			p2 *= x4;
		}

		double rez = (double) p1 / p2;
		System.out.println("The product of even numbers = " + p1);
		System.out.println("The product of odd numbers = " + p2);
		System.out.println("Rez = " + rez);

	}

}
