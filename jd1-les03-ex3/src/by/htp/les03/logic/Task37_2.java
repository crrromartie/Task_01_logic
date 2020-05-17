package by.htp.les03.logic;

public class Task37_2 {

	public static void task() {
		boolean x = true;
		boolean y = false;

		int z = 4585;
		int z1 = z % 10;
		int z2 = z / 10 % 10;
		int z3 = z / 100 % 10;
		int z4 = z / 1000 % 10;

		if ((z1 + z2) == (z3 + z4)) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}

}
