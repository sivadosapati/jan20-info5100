package class4;

abstract class Phone {
	void makeCall() {
	};

	void recieveCall() {
	}
}

public class iPhone extends Phone implements PictureDevice {
	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}
}
