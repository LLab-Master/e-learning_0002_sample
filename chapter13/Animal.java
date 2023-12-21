package chapter13;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	// 鳴くメソッド
	abstract void cry();
}
