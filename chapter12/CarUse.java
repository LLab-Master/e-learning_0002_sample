package chapter12;

public class CarUse {

	public static void main(String[] args) {
		Car voxy = new Car("Voxy", 130);
		HyBridCar aqua = new HyBridCar("Aquq", 70, 50);

		voxy.printDeclaredPower();
		aqua.printDeclaredPower();

	}

}
