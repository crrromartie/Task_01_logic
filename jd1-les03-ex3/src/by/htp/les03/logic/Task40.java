package by.htp.les03.logic;

public class Task40 {

	public static void task() {
		int x = 1;
		int temp1 = 2 * x + 4 * x * x * x;
		int temp2 = 3 * x * x;
		int rez1 = -temp1 + temp2;
		int rez2 = temp1 + temp2 + 1;
		System.out.println("If x = " + x + " Rez 1 = " + rez1);
		System.out.println("If x = " + x + " Rez 2 = " + rez2);
	}

}
