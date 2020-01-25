package class3;

public class Shop {

	public static void main(String[] args) {
		Bag jialiBag = new Bag(10, "Jiali");
		jialiBag.open();

		// System.out.println("Price of bag -> " + jialiBag.price);
		System.out.println("Price of bag -> " + jialiBag.getPrice());
		// jialiBag.name = "Siva";
		jialiBag.open();

		// jialiBag.price = 100;
		jialiBag.setPrice(5);
		jialiBag.open();
		jialiBag.setPrice(20);
		jialiBag.open();

	}

}
