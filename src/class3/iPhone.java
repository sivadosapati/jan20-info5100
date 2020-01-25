package class3;

public class iPhone {

	int price;
	String color;
	int memory;

	void makeCall() {
		System.out.println("make call");
	}

	void receiveCall() {
		System.out.println("recieve call");
	}

	void takePicture() {
		System.out.println("Take picture using standard iphone");
	}

	iPhone(int price) {
		this.price = price;
	}

	public static void main(String args[]) {
		// iPhone x = new iPhone();
		new iPhone(599);
		new iPhone(699);
	}
}
