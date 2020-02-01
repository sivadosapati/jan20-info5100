package class4;

public class Shop {

	public static void main(String[] args) {
		Chair c = new Chair();
		Sofa s = new Sofa();
		Bed b = new Bed();
		// Furniture f = new Furniture();
		c.provideComfort();
		s.provideComfort();
		b.provideComfort();

	}

}

abstract class Furniture {
	private float price;
	private float weight;
	private String brand;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract void provideComfort();
	//public abstract float getDiscount(); 

}

class Table extends Furniture {
	public void provideComfort() {
		System.out.println("Table is not providing comfort");
	}
}

class Sofa extends Furniture {
	public void provideComfort() {
		System.out.println("Sofa is giving comfort by providing an option to either sit or sleep");
	}

}

class Bed extends Furniture {

	public void provideComfort() {
		System.out.println("Bed is providing comfort");

	}

}

class Chair extends Furniture {
	public void provideComfort() {
		System.out.println("Chair is giving comfort by providing an option to sit");
	}
}