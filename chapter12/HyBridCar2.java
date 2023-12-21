package chapter12;

public class HyBridCar2 extends Car {

	private int moterPower; // モータ出力

	public HyBridCar2(String name, int enginePower, int moterPower) {
		super(name, enginePower);
		this.moterPower = moterPower;
	}

	@Override
	public void printDeclaredPower() {
		System.out.println(getEnginePower() + this.moterPower);
	}

}
