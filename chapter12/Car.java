package chapter12;

public class Car {

	private String name; // 車種
	private int enginePower;

	public Car(String name, int enginePower) {
		this.name = name;
		this.enginePower = enginePower;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public String getName() {
		return name;
	}

	// 定格出力をプリント
	public void printDeclaredPower() {
		System.out.println(enginePower);
	}

}
