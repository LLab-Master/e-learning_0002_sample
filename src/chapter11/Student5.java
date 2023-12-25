package chapter11;

public class Student5 {

	private String name;
	private int age;

	public Student5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student5(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("初めまして");
		System.out.println(name + "と申します " + age + "才です。");
	}

}
