package chapter10;

public class Student3 {
	// 生徒は最大30人までとする
	static final int MAX_NUMBER_OF_STUDENT = 30;
	static int numberOfStudent;

	String name;
	int age;

	void introduce() {
		System.out.println("初めまして");
		System.out.println(name + "と申します");
		System.out.println("よろしくお願いします。");
	}

}
