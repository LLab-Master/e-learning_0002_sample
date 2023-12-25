package chapter13;

public class AnimalUse {

	public static void main(String[] args) {
		// 動物たち
		Animal[] animals = { new Dog("タロー"), new Cat("たま"), new Rabit("うさ吉"), new Dog("ポチ") };

		// 順番に鳴く
		for (Animal animal : animals) {
			animal.cry();
		}

	}

}
