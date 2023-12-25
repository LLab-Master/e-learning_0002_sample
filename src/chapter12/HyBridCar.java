package chapter12;

public class HyBridCar extends Car {

	private int moterPower; // モータ出力

	public HyBridCar(String name, int enginePower, int moterPower) {
		super(name, enginePower);
		this.moterPower = moterPower;
	}

}
