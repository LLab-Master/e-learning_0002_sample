package chapter6;

import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("数値を入力してください：");
		// 入力した数値を、変数に代入する。
		int num = scan.nextInt();
		
		switch (num) {
		case 100:
			System.out.println("100です");
			break;
		case 200:
			System.out.println("200です");
			break;
		case 300:
			System.out.println("300です");
			break;
		default:
			System.out.println("それ以外です");
			break;
		}

	}

}
