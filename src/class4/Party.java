package class4;

import java.util.Scanner;

abstract class Food {
	public abstract void serve();

}

class Icecream extends Food {

	@Override
	public void serve() {
		// TODO Auto-generated method stub

	}
}

class Juice extends Food {

	@Override
	public void serve() {
		// TODO Auto-generated method stub

	}
}

class Starter extends Food {

	@Override
	public void serve() {
		// TODO Auto-generated method stub

	}
}

interface PictureDevice {
	void takePicture();
}

class Computer {

}

class Person {

}

class Painter extends Person implements PictureDevice {

	public void takePicture() {
		// TODO Auto-generated method stub

	}

}

class Laptop extends Computer implements PictureDevice {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub

	}

}

public class Party {

	void entertain(iPhone phone) {
		phone.takePicture();
	}

	void entertain(Camera camera) {
		camera.takePicture();
	}

	void entertainWithPictureDevice(PictureDevice pd) {
		pd.takePicture();
	}

	void serve(Food f) {
		f.serve();
	}

	void serve(Icecream ic) {

	}

	void serve(Juice juice) {

	}

	void serve(Starter starter) {
	}

	void serve(Icecream ic, Juice jc) {
		serve(ic);
		serve(jc);
	}

	public static void main(String args[]) {
		Party party = new Party();
		Painter painter = new Painter();
		party.entertainWithPictureDevice(painter);
		iPhone phone = new iPhone();
		Camera camera = new Camera();
		party.entertain(phone);
		party.entertain(camera);

		party.entertainWithPictureDevice(phone);
		party.entertainWithPictureDevice(camera);

		Icecream ic = new Icecream();
		Juice j = new Juice();
		party.serve(ic);
		party.serve(j);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter I for icecream, J for juice, S for starter or E for Exit");
			String x = scanner.nextLine();
			if (x.equals("E")) {
				break;
			}
			// serveFood(x, p);
		}

		PictureDevice pd = phone;
		pd = camera;

	}

	private static void serveFood(String x, Party p) {
		Food f = createFood(x);
		p.serve(f);
		/*
		 * if (x.equals("I")) { p.serve(new Icecream()); } if (x.equals("J")) {
		 * p.serve(new Juice()); }
		 */

	}

	private static Food createFood(String x) {
		// TODO Auto-generated method stub
		return null;
	}
}
