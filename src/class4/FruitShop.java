package class4;

public class FruitShop {

	public static void main(String[] args) {
		Fruit a = new Orange(4);
		Fruit b = new Apple(3);
		Fruit c = new Apple(5);
		System.out.println(a.price);
		System.out.println(b.price);
		System.out.println(c.price);
		System.out.println(a.placeOfPlanting);
		System.out.println(b.placeOfPlanting);
		System.out.println(a.plantationMethod);
		System.out.println(b.plantationMethod);
		b.plantationMethod = "Pot";
		System.out.println(c.plantationMethod);
		System.out.println(a.plantationMethod);
		System.out.println(Fruit.plantationMethod);
		// c.price = 15;

	}

}

class Fruit {
	final float price;
	static final String placeOfPlanting = "Earth";
	static String plantationMethod = "Ground";

	Fruit(float price) {
		this.price = price;
	}

	public final float getPrice() {
		return price;
	}

}

class Orange extends Fruit {

	Orange(float price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	// public float getPrice() {
	// return 0;
	// }

}

final class Apple extends Fruit {

	Apple(float price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

}

//class BigApple extends Apple{}
