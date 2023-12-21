package chapter12;

public class CarUse2 {

	public static void main(String[] args) {
		Car voxy = new Car("Voxy", 130);
		HyBridCar2 aqua = new HyBridCar2("Aquq", 70, 50);

		voxy.printDeclaredPower();
		aqua.printDeclaredPower();

	}

}
