package by.htp.les03.logic;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Input X\n");
		while (!in.hasNextInt()) {
			in.next();
		}
		int x = in.nextInt();
		System.out.print("Input Y\n");
		while (!in.hasNextInt()) {
			in.next();
		}
		int y = in.nextInt();
		System.out.println("X=" + x + "\nY=" + y);

		int sum = 0;

		sum = x + y;

		int dif = 0;
		dif = x - y;

		int prod = 0;
		prod = x * y;

		double quo = 0;
		quo = (double) x / y;

		System.out.println("Sum=" + sum + "\nDif=" + dif + "\nProd=" + prod + "\nQuo=" + quo);

	}

}
