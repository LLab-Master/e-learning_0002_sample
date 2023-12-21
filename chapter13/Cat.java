package chapter13;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	void cry() {
		System.out.println("にゃー");

	}

}
