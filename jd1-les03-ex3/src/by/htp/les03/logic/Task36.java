package by.htp.les03.logic;

public class Task36 {

	public static void task() {
		int number = 4589; 
		System.out.println("Initial number = " + number);

		int p1 = 1;
		int p2 = 1;

		while (number > 0) {
			if (number % 10 % 2 == 0) {
				p1 *= number % 10;
			} else if (number % 10 % 2 != 0) {
				p2 *= number % 10;
			}
			number /= 10;
		}
		double rez = (double) p1 / p2;
		System.out.println("The product of even numbers = " + p1);
		System.out.println("The product of odd numbers = " + p2);
		System.out.println("Rez = " + rez);

	}

}
