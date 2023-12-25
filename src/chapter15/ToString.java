package chapter15;

class Person {
	private String name;
	private int age;
	private String tel;

	public Person(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
}

public class ToString {

	public static void main(String[] args) {
		Person p1 = new Person("Yamada", 43, "121310");
		Person p2 = new Person("Tanaka", 32, "9433233");

		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
