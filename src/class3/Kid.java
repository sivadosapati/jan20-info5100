package class3;

import javafx.scene.shape.Circle;

public class Kid {

	public static void main(String[] args) {
		Cirlce c = new Cirlce(10);
		Kid k = new Kid();

		System.out.println(k.getAreaOfCircle(c));
		System.out.println(k.getPermiterOfCirlce(c));

	}

	public float getAreaOfCircle(Cirlce c) {
		return c.getArea();
	}

	public float getPermiterOfCirlce(Cirlce c) {
		return (2 * 22.0f / 7) * c.radius;
	}

}
