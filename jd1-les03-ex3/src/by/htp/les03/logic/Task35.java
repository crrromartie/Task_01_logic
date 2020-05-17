package by.htp.les03.logic;

public class Task35 {

	public static void task() {
		int m = 4589876;
		int n = 174;

		double x = (double) m / n;
		int s = (int) x;

		int raz = 1;
		double f = x;
		while (f != (int) f && raz < 1000000000) {
			f *= 10;
			raz *= 10;
		}

		double z = x - (int) x;
		int z1 = (int) (z * raz);
		int min = s % 10;
		s = s / 10;

		while (s > 0) {
			if (s % 10 < min) {
				min = s % 10;
			}
			s /= 10;
		}

		int max = z1 % 10;
		z1 = z1 / 10;

		while (z1 > 0) {
			if (z1 % 10 > max) {
				max = z1 % 10;
			}
			z1 /= 10;
		}
		System.out.println("The minimum digit from the integer part = " + min);
		System.out.println("The maximum digit from the fractional part = " + max);
		System.out.printf("%.9f\n", x);

	}

}
