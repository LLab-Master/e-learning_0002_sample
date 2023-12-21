package chapter8;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.nextLine();
		greet(name);
	}

	static void greet(String name) {
		System.out.println("こんにちは、" + name + "です");
	}

}
