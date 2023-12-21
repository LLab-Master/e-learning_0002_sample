package chapter6;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("点数を入力してください：");
		int score = scan.nextInt(); // 入力された数字を、変数に代入する。
		
		if (80 <= score && score <= 100) {
			System.out.println("Aランクです");
		} else if (60 <= score && score < 80) {
			System.out.println("Bランクです");
		} else if (40 <= score && score < 60) {
			System.out.println("Cランクです");
		} else if (0 <= score && score < 40) {
			System.out.println("Dランクです");
		} else {
			System.out.println("点数が不正です");
		}
	}

}
