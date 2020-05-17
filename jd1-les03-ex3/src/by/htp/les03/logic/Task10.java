package by.htp.les03.logic;

public class Task10 {

	public static void main(String[] args) {
		double x = 30;
		double y = 60;

		double rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

		System.out.println("Rez=" + rez);

	}

}
