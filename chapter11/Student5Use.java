package chapter11;

public class Student5Use {

	public static void main(String[] args) {
		Student5 tanaka = new Student5("田中", 32);
		Student5 yamada = new Student5("山田"); // 年齢不明

		tanaka.introduce();
		yamada.introduce();

	}

}
