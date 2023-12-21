package chapter13;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	void cry() {
		System.out.println("ワン");

	}

}
