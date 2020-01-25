package class3;

public class iPhoneX extends iPhone8 {

	iPhoneX(int price) {
		super(price);

	}

	void takeLivePhotos() {
		System.out.println("take live photos");
	}

	@Override
	void takePicture() {
		super.takePicture();
		uploadToCloud();
		// System.out.println("Taking much better pictures using X");
	}

	private void uploadToCloud() {
		System.out.println("Upload pictures to cloud");

	}

	@Override
	public String getModel() {
		return "iPhone X";
	}

}
