package class3;

class Marker {

}

class Phone {

}

class Badge {

}

class Ziploc {
	Marker m;
	Phone p;
	Badge b;

	public void display() {
		System.out.println(m + " -> " + p + " -> " + b);
	}
}

public class Bag {

	private String name;
	private float price;
	private String color;

	Marker marker;
	Phone phone;
	Badge badge;

	public void finalize() {
		System.out.println("Bag[" + name + "] is going to be destroyed");
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price < this.price) {
			this.price = price;
		} else {
			System.out.println("You are asking to change the price to a higher value -> " + price
					+ " where as the current value of bag is " + this.price + ". So I will not change the price");
		}
	}

	Bag() {
		System.out.println("Bag is created");
	}

	Bag(String n) {
		name = n;
		System.out.println("Bag is created with name -> " + name);
	}

	public Ziploc getZiploc() {
		Ziploc z = new Ziploc();
		z.p = phone;
		z.m = marker;
		z.b = badge;
		return z;
	}

	Bag(float price) {
		this.price = price;
		System.out.println("Bag is created with price -> " + price);
	}

	Bag(float price, String name) {
		this.price = price;
		this.name = name;
		System.out.println("Bag is created with price -> " + price + " and name -> " + name);
	}

	Bag(String color, float price, String name) {
		this(price, name);
		this.color = color;
		System.out.println("Color for this bag is -> " + color);

	}

	void open() {
		System.out.println("Bag[" + name + "," + price + "] is opened");
	}

	public static void main(String args[]) {
		Bag bag = new Bag();
		// System.out.println("Bag is created");
		bag.open();

		Bag anotherBag = new Bag();
		// System.out.println("Bag is created");

		Bag swathiBag = new Bag("Swathi");
		swathiBag.open();

		bag.name = "Leena";

		bag.open();

		new Bag(10);
		System.out.println("-----");
		Runtime.getRuntime().gc();
		Bag b = new Bag(15.50f, "Holiday");
		b.open();

		System.out.println("-----");

		new Bag("Black", 15.50f, "Siva").open();
		// b.open();
	}
}
