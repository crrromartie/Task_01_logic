package by.htp.les03.logic;

public class Task29 {

	public static void task() {
		double a = 6;
		double b = 8;
		double c = 9;

		double cosAC = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
		double angleACrad = Math.acos(cosAC);
		double angleACdeg = angleACrad * 180 / Math.PI;

		double cosAB = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		double angleABrad = Math.acos(cosAB);
		double angleABdeg = angleABrad * 180 / Math.PI;

		double cosBC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
		double angleBCrad = Math.acos(cosBC);
		double angleBCdeg = angleBCrad * 180 / Math.PI;

		System.out.println("Angle deg:");
		System.out.println("Angle AC = " + angleACdeg + "  Angle AB = " + angleABdeg + "  Angle BC = " + angleBCdeg);
		System.out.println("Angle rad:");
		System.out.println("Angle AC = " + angleACrad + "  Angle AB = " + angleABrad + "  Angle BC = " + angleBCrad);
	}

}
