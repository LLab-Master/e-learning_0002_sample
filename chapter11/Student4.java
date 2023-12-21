package chapter11;

public class Student4 {

	private String name;
	private int age;

	public Student4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduct() {
		System.out.println("初めまして");
		System.out.println(name + "と申します " + age + "才です。");
	}
}
