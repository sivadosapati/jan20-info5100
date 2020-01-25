package class3;

public class AppleStore {

	public static void main(String[] args) {
		iPhone8 a = new iPhone8(599);
		System.out.println(a.price);
		iPhoneX b = new iPhoneX(1099);
		System.out.println(b.price);

		a.makeCall();
		a.receiveCall();
		a.recordVideo();
		System.out.println("----");
		b.makeCall();
		b.receiveCall();
		b.takeLivePhotos();
		b.recordVideo();
		System.out.println("---");
		a.takePicture();
		System.out.println("****");
		b.takePicture();

	}

}
