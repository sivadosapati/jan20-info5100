package class3;

public class iPhone8 extends iPhone {

	iPhone8(int price) {
		super(price);
	}

	iPhone8() {
		super(1000);
	}

	void recordVideo() {
		System.out.println("record video");
	}

	void takePicture() {
		System.out.println("Taking a better picture using " + getModel());
	}

	public String getModel() {
		return "iPhone 8";
	}
}