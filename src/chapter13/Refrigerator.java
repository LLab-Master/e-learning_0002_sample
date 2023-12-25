package chapter13;

public class Refrigerator implements USB {

	String model;
	int capacity; // 容量

	public Refrigerator(String model, int capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}

	@Override
	public void tramsmitData() {
		System.out.println("電源を供給してもらいます");

	}

}
