package chapter11;

public class Student6Use {

	public static void main(String[] args) {

		Student6 tanaka = new Student6("中田", 32);
		tanaka.setName("田中"); // 名前を訂正
		System.out.println(tanaka.getName() + "さんは" + tanaka.getAge() + "才です");

	}

}
