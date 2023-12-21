package chapter15;

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		int len = name.length();
		return age + len;
	}

	@Override
	public boolean equals(Object obj) {
		Person2 other = (Person2) obj;
		if (name.equals(other.name) && age == other.age) {
			return true;
		}
		return false;
	}
}

public class Equals {

	public static void main(String[] args) {
		Person2 p1 = new Person2("Yamada", 23);
		Person2 p2 = new Person2("Suzuki", 33);
		Person2 p3 = new Person2("Yamada", 23);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
