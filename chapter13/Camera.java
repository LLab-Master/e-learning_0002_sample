package chapter13;

public class Camera implements USB {

	private String model;

	public Camera(String model) {
		this.model = model;
	}

	@Override
	public void tramsmitData() {
		System.out.println("撮影した写真の画像を転送します");

	}

}
