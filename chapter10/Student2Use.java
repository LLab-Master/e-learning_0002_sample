package chapter10;

public class Student2Use {

	public static void main(String[] args) {
		Student2 tanaka = new Student2();
		tanaka.name = "田中";
		tanaka.age = 32;
		Student2.numberOfStudent = 1; // 1人目生徒
		tanaka.introduct();

		Student2 suzuki = new Student2();
		suzuki.name = "鈴木";
		suzuki.age = 26;
		Student2.numberOfStudent++; // 2人目生徒
		suzuki.introduct();

		System.out.println("生徒の数は" + Student2.numberOfStudent + "人です");
	}

}
