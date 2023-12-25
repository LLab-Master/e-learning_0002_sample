package chapter4;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("1つめの値を入力してください：");
		int num1 = scan.nextInt();
		System.out.print("2つめの値を入力してください：");
		int num2 = scan.nextInt();

		System.out.println("num1 と num2 の合計は：" + (num1 + num2) + "です");

	}

}
