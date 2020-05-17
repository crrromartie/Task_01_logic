package by.htp.les03.logic;

public class Task08 {

	public static void main(String[] args) {
		double a = 5;
		double b = 6;
		double c = 7;
		double rez = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("Rez=" + rez);
	}

}
