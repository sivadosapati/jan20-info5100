package class3;

public class ClassRoom {
	public static void main(String args[]) {
		Bag y = new Bag("Yeshawsini");
		Bag g = new Bag("Geetha");

		Ziploc z = new Ziploc();
		z.p = y.phone;
		z.m = y.marker;
		z.b = y.badge;

		Ziploc a = g.getZiploc();

	}
}
