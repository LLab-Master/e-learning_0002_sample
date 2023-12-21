package chapter7;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num; // 前処理
		
		do {
			System.out.print("パスコードを入力してください：");
			num = scan.nextInt();
		} while (num != 5);
		
		
		System.out.println("正しいパスコードです");

	}

}
